public class Circle extends Shape{
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(){
        radius = 0;
    }

    @Override
    public double getArea(){
        return Math.PI*Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter(){
        return Math.PI*radius*2;
    }

    @Override
    public String toString(){
        return "Circle";
    }
}

