import java.awt.geom.Area;

public class CircleExerciseTwo {

    // Zona de Atributos
    private double radius;

    // Zona de Metodos (Constructores):
    //Metodo 1
    public CircleExerciseTwo(){
        this.radius = 1.0;
    }
    // Metodo 2:
    public CircleExerciseTwo(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }

    public double getCircunference(){
        return 2 * Math.PI * radius;
    }

    public String toString(){
        return "Circle[radius= "+ radius +"]";
    }
}