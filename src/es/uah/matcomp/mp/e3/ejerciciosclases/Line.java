package es.uah.matcomp.mp.e3.ejerciciosclases;

public class Line extends Point{
    // A line composes of two points (as instance variables)
    private Point begin; // beginning point
    private Point end; // ending point
    // Constructors
    public Line (Point begin, Point end) { // caller to construct the Points
        this.begin = begin;
        this.end = end;
    }
    public Line (int beginX, int beginY, int endX, int endY) {
        begin = new Point(beginX, beginY); // construct the Points here
        end = new Point(endX, endY);
    }
    // Public methods
    public String toString() {
        return begin.toString() + " " + end.toString();
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
    public float getBeginX() {
        return super.getX();
    }
    public float getBeginY() {
        return super.getY();
    }
    public float getEndX() {
        return super.getX();
    }
    public float getEndY() {
        return super.getY();
    }
    public void setBeginX(float x) {
        super.setX(x);
    }
    public void setBeginY(float y) {
        super.setY(y);
    }
    public void setBeginXY(float x, float y) {
        super.setX(x);
        super.setY(y);
    }
    public void setEndX(float x) {
        super.setX(x);
    }
    public void setEndY(float y) {
        super.setY(y);
    }
    public void setEndXY(float x, float y) {
        super.setX(x);
        super.setY(y);
    }
    public float getLength() {
        float xdiff = getEndX() - getBeginX();
        float ydiff = getEndY() - getBeginY();
        return (float) Math.sqrt(xdiff * xdiff + ydiff * ydiff);
    } // Length of the line
    // Math.sqrt(xDiff*xDiff + yDiff*yDiff)
    public double getGradient(float x1, float y1, float x2, float y2) {
        float xDiff = x2 - x1;
        float yDiff = y2 - y1;
        return Math.atan2(yDiff, xDiff); // Gradient in radians
    }
}
