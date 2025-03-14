package es.uah.matcomp.mp.e4.ejerciciosclases;

public class MovablePoint implements Movable{
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public String toString(){
        return "(" + x + "," + y + ") Speed=(" + xSpeed + "," + ySpeed + ")";
    }
    public void MoveUp(){
        y -= ySpeed;
    }
    public void MoveDown(){
        y += ySpeed;
    }
    public void MoveLeft(){
        x -= xSpeed;
    }
    public void MoveRight(){
        x += xSpeed;
    }
}
