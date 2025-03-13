package es.uah.matcomp.mp.e2.ejerciciosclases;

public class MyCircle {
    private Mypoint center;
    private int radius;

    public MyCircle(){
        center = new Mypoint(0,0);
        radius = 1;
    }
    public MyCircle(int x, int y){
        center = new Mypoint(x, y);
        radius = 1;
    }
    public MyCircle(Mypoint center, int radius){
        this.center = center;
        this.radius = radius;
    }
    public int getRadius(){
        return radius;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }
    public int getCenterX(){
        return center.getX();
    }
    public void setCenterX(int x){
        this.center.setX(x);
    }
    public int getCenterY(){
        return center.getY();
    }
    public void setCenterY(int y){
        this.center.setY(y);
    }
    public int[] getCenterXY(){
        return new int[]{this.center.getX(),this.center.getY()};
    }
    public void setCenterXY(int x, int y){
        this.setCenterX(x);
        this.setCenterY(y);
    }
    public String toString(){
        return "MyCircle[radius= " + radius + ", center= " + center.toString() + "]";
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }
    public double getCircumference(){
        return 2 * Math.PI * radius;
    }
    public double distance(MyCircle other){
        return center.distance(other.center);
    }
}
