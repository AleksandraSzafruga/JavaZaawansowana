package pl.sda.podstawyoop;

public class Main {

    public static void main(String[] args) {
        Point p0 = new Point();
        Point p1 = new Point(2, 10);
        Point p2 = new Point(-10, 20);

        comparePoints(p0, p1);
        comparePoints(p0, p2);
        comparePoints(p1, p2);
        comparePoints(p2, p1);
        comparePoints(new Point(), p1);
        comparePoints(new Point(), p2);

        Line l1 = new Line(p1, p2);
        System.out.println(l1);
        System.out.println("Długość lini to: " + l1.calculateLenght());

    }

    public static void comparePoints(Point p1, Point p2) {
        System.out.println(p1);
        System.out.println(p2);
        System.out.println("Odleglosc miedzy tymi punktami wynosi: " + p1.distance(p2) + "\n");
    }
}