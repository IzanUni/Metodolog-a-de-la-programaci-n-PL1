package es.uah.matcomp.mp.e2.ejerciciosclases;

public class PruebaMyCicle {
        public static void main(String[] args) {
            // Crear círculos con diferentes constructores
            MyCircle circle1 = new MyCircle();
            MyCircle circle2 = new MyCircle(5, 5);
            MyCircle circle3 = new MyCircle(new Mypoint(3, 4), 10);

            // Mostrar los valores iniciales de los círculos
            System.out.println("Círculo 1: " + circle1);
            System.out.println("Círculo 2: " + circle2);
            System.out.println("Círculo 3: " + circle3);

            // Modificar los radios y las posiciones de los círculos
            circle1.setRadius(7);
            circle2.setCenterXY(2, 2);
            circle3.setRadius(15);

            // Mostrar los valores después de modificar
            System.out.println("Círculo 1 después de modificar: " + circle1);
            System.out.println("Círculo 2 después de modificar: " + circle2);
            System.out.println("Círculo 3 después de modificar: " + circle3);

            // Calcular y mostrar área y circunferencia
            System.out.println("Área de círculo 1: " + circle1.getArea());
            System.out.println("Circunferencia de círculo 1: " + circle1.getCircumference());

            System.out.println("Área de círculo 2: " + circle2.getArea());
            System.out.println("Circunferencia de círculo 2: " + circle2.getCircumference());

            System.out.println("Área de círculo 3: " + circle3.getArea());
            System.out.println("Circunferencia de círculo 3: " + circle3.getCircumference());

            // Calcular la distancia entre círculos
            System.out.println("Distancia entre círculo 1 y círculo 2: " + circle1.distance(circle2));
            System.out.println("Distancia entre círculo 2 y círculo 3: " + circle2.distance(circle3));
        }
}
