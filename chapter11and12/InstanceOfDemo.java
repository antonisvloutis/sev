package gr.aueb.sev.chapter11and12;

public class InstanceOfDemo {
    private static final Point[] points;

    //static initializer
    static {
        points = new Point[]{new Point(1), new Point2D(2, 3), new Point3D(5, 6, 7)};
    }

    public static void main(String[] args) {
        for (Point point : points) {
            if (point instanceof Point) {
                System.out.println("Point: " + point.getClass().getSimpleName());
            }
            if (point instanceof Point2D) {
                System.out.println("Point2D: " + point.getClass().getSimpleName());
            }
            if (point instanceof Point3D) {
                System.out.println("Point3D: " + point.getClass().getSimpleName());
            }
        }
    }
}
