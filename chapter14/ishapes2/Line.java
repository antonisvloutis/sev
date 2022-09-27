package gr.aueb.sev.chapter14.ishapes2;

public class Line extends AbstractShape implements ILine {
    private Point point1;
    private Point point2;

    public Line(){}

    public Line(Point point1, Point point2){
        this.point1=new Point(point1);
        this.point2=new Point(point2);
    }

    public Point getPoint1() {
        return new Point(point1);
    }

    public void setPoint1(Point point1) {
        this.point1 = point1;
    }

    public Point getPoint2() {
        return new Point(point2);
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }
}
