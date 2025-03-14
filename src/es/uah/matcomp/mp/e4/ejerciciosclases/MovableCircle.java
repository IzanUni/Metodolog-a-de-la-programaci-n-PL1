package es.uah.matcomp.mp.e4.ejerciciosclases;

public class MovableCircle {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        this.center = new MovablePoint(x,y,xSpeed,ySpeed);
        this.radius = radius;
    }
    public String toString(){
        return center.toString() + ",radius=" + radius;
    }
    public void moveUp(){
        center.MoveUp();
    }
    public void moveDown(){
        center.MoveDown();
    }
    public void moveLeft(){
        center.MoveLeft();
    }
    public void moveRight(){
        center.MoveRight();
    }
}
