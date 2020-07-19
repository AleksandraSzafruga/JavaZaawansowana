package pl.sda.podstawyoop;

public class Main {

    public static void main(String[] args) {
        Point2D p0 = new Point2D();
        Point2D p1 = new Point2D(2, 10);
        Point2D p2 = new Point2D(-10, 20);

        comparePoints(p0, p1);
        comparePoints(p0, p2);
        comparePoints(p1, p2);
        comparePoints(p2, p1);
        comparePoints(new Point2D(), p1);
        comparePoints(new Point2D(), p2);

        Line l1 = new Line(p1, p2);
        System.out.println(l1);
        System.out.println("Długość lini to: " + l1.calculateLenght());

        Point3D p3d0 = new Point3D();
        Point3D p3d1 = new Point3D(10, 15, 13);

        System.out.println(p3d1.distance(p3d0));
        System.out.println(p3d1.distanceOnPlane(p1));
        System.out.println(p3d1.distance(p1));
    }

    public static void comparePoints(Point2D p1, Point2D p2) {
        System.out.println(p1);
        System.out.println(p2);
        System.out.println("Odleglosc miedzy tymi punktami wynosi: " + p1.distance(p2) + "\n");
    }
}