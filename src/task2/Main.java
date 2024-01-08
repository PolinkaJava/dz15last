package task2;

import java.awt.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Animal animals = new Animal();
        animals.addAnimal("Dog");
        animals.addAnimal("Tiger");
        animals.addAnimal("Panda");
        animals.addAnimal("Cat");
        animals.print();
        animals.removeAnimal();
        System.out.println("\n");
        animals.print();
    }
}