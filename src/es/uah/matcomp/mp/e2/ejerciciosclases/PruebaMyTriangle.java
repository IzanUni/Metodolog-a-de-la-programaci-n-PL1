package es.uah.matcomp.mp.e2.ejerciciosclases;

public class PruebaMyTriangle {
        public static void main(String[] args) {
            // Crear triángulos con diferentes constructores
            MyTriangle triangle1 = new MyTriangle(0, 0, 3, 0, 3, 4);
            MyTriangle triangle2 = new MyTriangle(new Mypoint(1, 1), new Mypoint(4, 1), new Mypoint(2, 5));
            MyTriangle triangle3 = new MyTriangle(new Mypoint(0, 0), new Mypoint(2, 2), new Mypoint(4, 0));

            // Mostrar información de los triángulos
            System.out.println("Triángulo 1: " + triangle1);
            System.out.println("Triángulo 2: " + triangle2);
            System.out.println("Triángulo 3: " + triangle3);

            // Calcular y mostrar perímetros
            System.out.println("Perímetro de triángulo 1: " + triangle1.getPerimeter());
            System.out.println("Perímetro de triángulo 2: " + triangle2.getPerimeter());
            System.out.println("Perímetro de triángulo 3: " + triangle3.getPerimeter());

            // Determinar el tipo de triángulo
            System.out.println("Tipo de triángulo 1: " + triangle1.getType());
            System.out.println("Tipo de triángulo 2: " + triangle2.getType());
            System.out.println("Tipo de triángulo 3: " + triangle3.getType());
        }
}
