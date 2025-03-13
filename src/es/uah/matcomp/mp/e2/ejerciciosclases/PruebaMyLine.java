package es.uah.matcomp.mp.e2.ejerciciosclases;

public class PruebaMyLine {
        public static void main(String[] args) {
            // Crear dos puntos
            Mypoint p1 = new Mypoint(0, 0);
            Mypoint p2 = new Mypoint(3, 4);

            // Crear una línea usando los puntos
            MyLine line1 = new MyLine(p1, p2);

            // Crear otra línea usando coordenadas
            MyLine line2 = new MyLine(2, 2, 5, 6);

            // Imprimir información de las líneas
            System.out.println("Línea 1: " + line1);
            System.out.println("Línea 2: " + line2);

            // Probar métodos de acceso
            System.out.println("Inicio de línea 1: " + line1.getBegin());
            System.out.println("Fin de línea 1: " + line1.getEnd());

            System.out.println("Inicio de línea 2: " + line2.getBegin());
            System.out.println("Fin de línea 2: " + line2.getEnd());

            // Probar cambios en la línea
            line1.setBeginXY(1, 1);
            line1.setEndXY(4, 5);
            System.out.println("Línea 1 después de modificar: " + line1);

            // Calcular y mostrar la longitud y gradiente de las líneas
            System.out.println("Longitud de línea 1: " + line1.getLength());
            System.out.println("Gradiente de línea 1: " + line1.getGradient());

            System.out.println("Longitud de línea 2: " + line2.getLength());
            System.out.println("Gradiente de línea 2: " + line2.getGradient());
        }
}
