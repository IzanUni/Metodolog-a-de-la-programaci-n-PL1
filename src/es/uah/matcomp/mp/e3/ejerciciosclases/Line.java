package es.uah.matcomp.mp.e3.ejerciciosclases;

public class Line {
    private Point begin; // Punto de inicio
    private Point end; // Punto final

    // Constructores
    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    public Line(int beginX, int beginY, int endX, int endY) {
        begin = new Point(beginX, beginY);
        end = new Point(endX, endY);
    }

    // Métodos getters y setters
    public Point getBegin() { return begin; }
    public void setBegin(Point begin) { this.begin = begin; }

    public Point getEnd() { return end; }
    public void setEnd(Point end) { this.end = end; }

    public float getBeginX() { return begin.getX(); }
    public float getBeginY() { return begin.getY(); }
    public float getEndX() { return end.getX(); }
    public float getEndY() { return end.getY(); }

    public void setBeginX(float x) { begin.setX(x); }
    public void setBeginY(float y) { begin.setY(y); }
    public void setBeginXY(float x, float y) { begin.setXY(x, y); }

    public void setEndX(float x) { end.setX(x); }
    public void setEndY(float y) { end.setY(y); }
    public void setEndXY(float x, float y) { end.setXY(x, y); }

    // Cálculo de la longitud de la línea
    public float getLength() {
        float xDiff = getEndX() - getBeginX();
        float yDiff = getEndY() - getBeginY();
        return (float) Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    // Cálculo de la pendiente en radianes
    public double getGradient() {
        float xDiff = getEndX() - getBeginX();
        float yDiff = getEndY() - getBeginY();
        return Math.atan2(yDiff, xDiff);
    }

    @Override
    public String toString() {
        return "Line[begin=" + begin + ", end=" + end + "]";
    }
}
