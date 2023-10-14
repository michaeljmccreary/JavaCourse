public class Rectangle extends Shape {
    private double length;
    private double width;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Rectangle() {
        this.length=length;
        this.width=width;
    }

    public Rectangle(double length, double width) {
        this.length=length;
        this.width=width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea(){
        return length * width;
    }

    @Override
    public double getPerimeter(){
        return (length * 2) + (width * 2);
    }

    @Override
    public String toString(){
        return "Rectangle";
    }
}
