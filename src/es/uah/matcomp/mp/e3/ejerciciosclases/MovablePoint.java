package es.uah.matcomp.mp.e3.ejerciciosclases;

public class MovablePoint extends Point{
    private float xSpeed;
    private float ySpeed;

    MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    MovablePoint(float xSpeed, float ySpeed){
        super();
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    MovablePoint(){
        super();
        this.xSpeed = 0.0f;
        this.ySpeed = 0.0f;
    }
    public float getXSpeed() {
        return xSpeed;
    }
    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }
    public float getYSpeed() {
        return ySpeed;
    }
    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        float[] Speed = new float[2];
        Speed[0] = xSpeed;
        Speed[1] = ySpeed;
        return Speed;
    }
    @Override
    public String toString(){
        return super.toString() + ",Speed=(" + xSpeed + "," + ySpeed + ")";
    }
    public MovablePoint move(){
        super.setX(super.getX() + this.xSpeed);
        super.setY(super.getY() + this.ySpeed);
        return this;
    }
}
