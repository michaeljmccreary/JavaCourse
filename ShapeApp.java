import java.text.DecimalFormat;
import java.util.Scanner;

public class ShapeApp {
    public static void main(String[] args) {

        Shape shape = null;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter 1 for square, 2 for rectangle, 3 for a circle");
        int choice = keyboard.nextInt();
        if(choice == 1){
            shape = new Square(10);
        }
        else if (choice== 2){
            shape = new Rectangle(4, 6);
        }
        else if (choice == 3){
            shape = new Circle(5);
        }

        printShape(shape);
    }
    public static void printShape(Shape shape){
        DecimalFormat fmt = new DecimalFormat("#.00");
        System.out.println("Type of shape is " + shape + '\n' + "Area " + fmt.format(shape.getArea()) + '\n' + "Perimeter " + fmt.format(shape.getPerimeter()));

        if(shape instanceof Square){
            System.out.println("Side " + fmt.format(((Square) shape).getSide()));
        }
        else if (shape instanceof Rectangle){
            System.out.println("Length: " + fmt.format(((Rectangle) shape).getLength()) + '\n' + "Width: " + fmt.format(((Rectangle) shape).getWidth()));
        }
        else if (shape instanceof Circle){
            System.out.println("Radius: " + fmt.format(((Circle) shape).getRadius()));
        }
    }
}
