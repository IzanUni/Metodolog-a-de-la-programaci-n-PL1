package es.uah.matcomp.mp.e2.ejerciciosclases;

public class Mypoint {
    private int x;
    private int y;

    public Mypoint() {
        this.x = 0;
        this.y = 0;
    }
    public Mypoint(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    public int[] getXY(){
        return new int[]{this.x, this.y};
    }
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }
    public String toString(){
        return "(" + x + "," + y + ")";
    }
    public double distance(int x, int y){
        return  Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }
    public double distance(Mypoint another){
        return this.distance(another.getX(), another.getY());
    }
    public double distance(){
        return this.distance(0,0);
    }


}
