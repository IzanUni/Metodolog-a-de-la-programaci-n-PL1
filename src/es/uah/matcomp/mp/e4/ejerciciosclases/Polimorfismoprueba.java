package es.uah.matcomp.mp.e4.ejerciciosclases;

public class Polimorfismoprueba {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.5, "red", false); // Upcast Circle to Shape
        System.out.println(s1);                    // Circle's toString()
        System.out.println(s1.getArea());         // Circle's getArea()
        System.out.println(s1.getPerimeter());    // Circle's getPerimeter()
        System.out.println(s1.getColor());        // Shape's getColor()
        System.out.println(s1.isFilled());        // Shape's isFilled()

        // Downcast back to Circle
        Circle c1 = (Circle)s1;
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

        // Shape s2 = new Shape(); // Error: Cannot instantiate abstract class

        Shape s3 = new Rectangle(1.0, 2.0, "red", false); // Upcast Rectangle to Shape
        System.out.println(s3);             // Rectangle's toString()
        System.out.println(s3.getArea());   // Rectangle's getArea()
        System.out.println(s3.getPerimeter());// Rectangle's getPerimeter()
        System.out.println(s3.getColor());  // Shape's getColor()

        Rectangle r1 = (Rectangle)s3;       // Downcast to Rectangle
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());

        Shape s4 = new Square(6.6); // Upcast Square to Shape
        System.out.println(s4);     // Square's toString()
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());

        // Downcast Shape to Rectangle (allowed because Square is a Rectangle)
        Rectangle r2 = (Rectangle)s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        System.out.println(((Square)r2).getSide());
        System.out.println(r2.getLength());

        // Downcast Rectangle to Square
        Square sq1 = (Square)r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());
    }
}
