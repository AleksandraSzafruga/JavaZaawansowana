package abstractclass;

public class Runner {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle(5, 10, "yellow");
        System.out.println(r1);

        Triangle t1 = new Triangle(5, 10, "green");
        System.out.println(t1);

        Shape[] shapes = {r1, t1};
        for (Shape s : shapes)
            System.out.println(s);
    }
}