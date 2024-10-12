package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;
public class ZooManagement {

    public static void main(String[] args) {

        Animal lion = new Animal();
        lion.setName("Simba");
        lion.setAge(8);
        lion.setFamily("Cats");
        lion.setMammal(true);

        // Create Zoo objects using the constructor
        Zoo myZoo = new Zoo("Wildlife Park", "Ariana", 25);
        Zoo notMyZoo = new Zoo("WaterPark", "Siliana", 20);


        Animal dog = new Animal("Canine", "Snoopy", 2, true);


        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(dog));
        System.out.println(myZoo.addAnimal(dog));


        myZoo.displayAnimals();


        System.out.println("Search result for dog: " + myZoo.searchAnimal(dog));

        // Create another animal
        Animal dog2 = new Animal("Canine", "Rex", 2, true);
        System.out.println("Search result for second dog: " + myZoo.searchAnimal(dog2));


        System.out.println(myZoo);


        myZoo.addAnimal(lion);
        myZoo.addAnimal(dog);
        myZoo.addAnimal(dog2);
        myZoo.displayAnimals();


        // System.out.println("Removing lion: " + myZoo.removeAnimal(lion));
        // System.out.println("Removing dog: " + myZoo.removeAnimal(dog));


        myZoo.displayAnimals();
    }
}
