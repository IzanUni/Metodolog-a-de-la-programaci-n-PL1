package es.uah.matcomp.mp.e3.ejerciciosclases;

public class Square extends Rectangle {
    public Square(){
        super();
    }
    public Square(double side){
        super(side, side);
    }
    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }
    public double getSide(){
        return super.getWidth();
    }
    public void setSide(double side){
        super.setWidth(side);
        super.setLength(side);
    }
    public String toString(){
        return "Square[" + super.toString() + "]";
    }
}