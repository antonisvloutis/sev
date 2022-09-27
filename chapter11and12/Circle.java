package gr.aueb.sev.chapter11and12;

public class Circle {
    private Point center;
    private int radius;

    public Circle(){}

    public Circle(Point center, int radius) {
       // this.center = new Point(center.getX(),center.getY());
        this.radius = radius;
    }

    /*public Point getCenter() {
        return new Point(center.getX(),center.getY());
    }*/

    public void setCenter(Point center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

  /*  public void move(){
        center.move(2,3);
    }*/
}
