package shape;

public class Circle extends Shape{
    private double radius;

    public Circle() {
        this.radius = 1.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
                this.radius = radius;
    }

    @Override
    public void setColor(String color) {
        super.setColor(color);
    }

    @Override
    public void setFilled(boolean filled) {
        super.setFilled(filled);
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String getColor() {
        return super.getColor();
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public boolean isFilled() {
        return super.isFilled();
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }

    public double getPerimeter(){
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "A Circle with radius "
                + this.radius
                + ", which is a subclass of "
                + super.toString();
    }
}
