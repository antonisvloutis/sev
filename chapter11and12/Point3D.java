package gr.aueb.sev.chapter11and12;

public class Point3D extends Point2D{
    private double z;
    public Point3D(){}

    public Point3D(double z) {
        //super();
        this.z = z;
    }

    public Point3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    /*@Override
    public String pointToString() {
        return "(" + getX() + "," + getY() + "," + z + ")";
    }*/

    @Override
    public String toString(){
        return "(" + getX() + "," + getY() + "," + z + ")";
    }

    @Override
    protected void reset() {
        super.reset();
        z = 0;
    }

    public void move(double x, double y, double z){
        super.move(x,y);
        this.z += z;
    }
}
