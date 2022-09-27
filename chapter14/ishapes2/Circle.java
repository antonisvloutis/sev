package gr.aueb.sev.chapter14.ishapes2;

public class Circle extends AbstractShape implements ICircle {
    private Point point;
    private double radius;

    public Circle(){}

    public Circle(Point point, double radius) {
        this.point = new Point(point);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public Point getPoint() {
        return new Point(this.point);
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
