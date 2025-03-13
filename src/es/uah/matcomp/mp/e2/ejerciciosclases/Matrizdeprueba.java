package es.uah.matcomp.mp.e2.ejerciciosclases;

public class Matrizdeprueba {
    public static void main(String[] args) {
        // Crear un array de 10 puntos MyPoint con valores (1,1), (2,2), ..., (10,10)
        Mypoint[] puntos = new Mypoint[10];

        for (int i = 0; i < puntos.length; i++) {
            puntos[i] = new Mypoint(i + 1, i + 1);
        }

        // Crear la matriz de distancias
        double[][] matrizDistancias = new double[10][10];

        // Calcular las distancias entre todos los puntos
        for (int i = 0; i < puntos.length; i++) {
            for (int j = 0; j < puntos.length; j++) {
                matrizDistancias[i][j] = puntos[i].distance(puntos[j]);
            }
        }

        // Imprimir la matriz de distancias
        System.out.println("Matriz de distancias:");
        for (int i = 0; i < puntos.length; i++) {
            for (int j = 0; j < puntos.length; j++) {
                System.out.printf("%.2f\t", matrizDistancias[i][j]); // Formato con 2 decimales
            }
            System.out.println(); // Nueva línea para cada fila
        }
    }

}
