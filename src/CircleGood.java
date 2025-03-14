public class CircleGood {
    //Zona de Atributos:
    private double radius; //Radio del circulo

    //Zona de Constructores:
    public CircleGood() {
        this.radius = 1;
    }
    public CircleGood(double radius) {
        this.radius = radius;
    }

    //Zona de Metodos:
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    public String toString() {
        return "CircleGood[radius=" + radius + "]";
    }
}
