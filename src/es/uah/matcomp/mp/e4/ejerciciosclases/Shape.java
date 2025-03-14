package es.uah.matcomp.mp.e4.ejerciciosclases;
public abstract class Shape {
    protected String color;
    protected Boolean filled;

    public Shape(){
        this.color = "red";
        this.filled = Boolean.TRUE;
    }
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(Boolean filled) {
        this.filled = filled;
    }
    public abstract double getArea();
    public abstract double getPerimeter();
    public String toString(){
        return "Shape[color=" + color + ", filled=" + filled + "]";
    }

}