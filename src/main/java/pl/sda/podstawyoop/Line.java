package pl.sda.podstawyoop;

public class Line {
    private Point begin;
    private Point end;

    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    public Point getBegin() {
        return begin;
    }

    public Point getEnd() {
        return end;
    }

    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public void setEnd(Point end) {
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
