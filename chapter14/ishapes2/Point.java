package gr.aueb.sev.chapter14.ishapes2;

public class Point extends AbstractShape implements IShape {
    private double x;
    private double y;
    public Point(){}

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point point){
        this.x=point.x;
        this.y=point.y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
