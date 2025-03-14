package es.uah.matcomp.mp.e3.ejerciciosclases;

public class PruebaAnimales { public static void main(String[] args) {
    // Crear instancias de las clases
    Animal animal = new Animal("Genérico");
    Mammal mammal = new Mammal("Mamífero");
    Cat cat = new Cat("Gatito");
    Dog dog1 = new Dog("Perro1");
    Dog dog2 = new Dog("Perro2");

    // Imprimir información de los animales
    System.out.println(animal);
    System.out.println(mammal);
    System.out.println(cat);
    System.out.println(dog1);
    System.out.println(dog2);

    // Probar métodos específicos
    cat.greets(); // Debería imprimir "Meow"
    dog1.greets(); // Debería imprimir "Woof"
    dog1.greets(dog2); // Debería imprimir "Wooooof"
}
}
