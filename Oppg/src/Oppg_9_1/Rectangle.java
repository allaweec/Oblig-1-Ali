package Oppg_9_1;

public class Rectangle {

    private double height = 1;
    private double width = 1;

    public Rectangle () {
    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getArea() {
        return height * width;
    }

    public double getPerimeter() {
        return (2*height + 2*width);
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
}
