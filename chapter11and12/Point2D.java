package gr.aueb.sev.chapter11and12;

public class Point2D extends Point {
    private double y;

    public Point2D(){}

    public Point2D(double x,double y) {
        super(x);
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

/*    @Override
    public String pointToString() {
        return "(" + getX() + "," + y + ")";
    }*/

    @Override
    public String toString(){
        return "(" + getX() + "," + y + ")";
    }

    @Override
    protected void reset() {
        super.reset();
        y = 0;
    }

    public void move(double x, double y){
        super.move(x);
        this.y += y;
    }
}
