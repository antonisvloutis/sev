package gr.aueb.sev.chapter11and12;

/**
 * A simple one-dimension point.
 */

public class Point {
    private double x;

    public Point(){}

    public Point(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    /*public String pointToString(){
        return "(" + x + ")";
    }*/

    @Override
    public String toString() {
        return "(" + x + ")";
    }

    public void move(double x){
        this.x += x;
    }

    protected void reset() {
        x = 0;
    }
}
