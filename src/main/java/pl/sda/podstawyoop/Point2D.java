package pl.sda.podstawyoop;

public class Point2D {
    protected int x;
    protected int y;

    public Point2D() {
    }

    public Point2D(int x, int y) {
        //this.x = x;
        setX(x);
        //this.y = y;
        setY(y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("(%d, %d)",x, y);
    }

    public int[] getXY() {
        int[] tab = {this.x, this.y};
        return tab;
    }

    public void setXY(int x, int y) {
        //this.x = x;
        setX(x);
        //this.y = y;
        setY(y);
    }

    public double distance (int x, int y) {
       return Math.sqrt(Math.pow(x - this.x,2) + Math.pow(y - this.y,2));
    }

    public double distance(Point2D another) {
        return distance(another.x, another.y);
    }

    public double distance() {
        return distance(0,0);
    }
}
