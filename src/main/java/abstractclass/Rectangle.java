package abstractclass;

public class Rectangle extends Shape {

    private int a, b;

    public Rectangle(int a, int b, String color) {
        super(color);
        this.a = a;
        this.b = b;
    }

    @Override
    public double calcArea() {
        return a * b;
    }

    @Override
    public String toString() {
        return String.format("To jest kwadrat o wymiarach %d x %d - jego pole wynosi %.2f. %s",
                a, b, calcArea(), super.toString());
    }
}
