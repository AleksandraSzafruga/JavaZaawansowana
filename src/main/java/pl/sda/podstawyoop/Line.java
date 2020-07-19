package pl.sda.podstawyoop;

public class Line {
    private Point2D begin;
    private Point2D end;

    public Line(Point2D begin, Point2D end) {
        this.begin = begin;
        this.end = end;
    }

    public Point2D getBegin() {
        return begin;
    }

    public Point2D getEnd() {
        return end;
    }

    public void setBegin(Point2D begin) {
        this.begin = begin;
    }

    public void setEnd(Point2D end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return String.format("Odcinek [begin = %s, end = %s]", begin.toString(), end.toString());
    }

    public double calculateLenght (){

        return begin.distance(end);
    }
}
