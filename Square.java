public class Square extends Shape {
    private double side;

    public Square(double side){
        this.side=side;
    }

    public Square(){
        this.side=0;
    }

    public double getSide(){
        return side;
    }

    public void setSide(double side){
        this.side=side;
    }

    @Override
    public double getArea(){
        return side * side;
    }

    @Override
    public double getPerimeter(){
        return side * 4;
    }

    @Override
    public String toString(){
        return "Square";
    }
}
