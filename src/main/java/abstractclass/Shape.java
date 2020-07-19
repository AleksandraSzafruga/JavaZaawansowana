package abstractclass;

public abstract class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract double calcArea();

    public String tooString() {
        return "Ten kształt jest koloru" + color + "\n";
    }

}
