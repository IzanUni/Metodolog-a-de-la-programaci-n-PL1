import java.awt.geom.Area;

public class CircleExerciseTwo {

    // Zona de Atributos
    private double radius;
    private String color;

    // Zona de Constructores:
    public CircleExerciseTwo(){
        this.radius = 1.0;
        this.color = "red";
    }

    public CircleExerciseTwo(double radius){
        this.radius = radius;
        this.color = "red";
    }

    public CircleExerciseTwo(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public void setColor(String color){
        this.color = color;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }

    public double getCircunference(){
        return 2 * Math.PI * radius;
    }

    public String toString(){
        return "Circle[radius= " + radius + ". color= " + color + "]";
    }
}