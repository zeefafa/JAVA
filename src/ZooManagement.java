//import java.util.Scanner;

public class ZooManagement {

    public static void main(String[] args) {
        /*int nbrCages ;
        String zooName ;
        Scanner scan = new Scanner(System.in);

        System.out.println("enter the name: ");
        zooName = scan.nextLine();

        System.out.println("enter the nbr cages: ");
        nbrCages = scan.nextInt();


        System.out.println(zooName + " comporte " + nbrCages + " cages");*/



        Animal lion = new Animal("eee", "Lion", 5, true);
        Animal elephant = new Animal("Elephantidae", "Elephant", 10, true);
        Animal crocodile = new Animal("Crocodylidae", "Crocodile", 8, false);

        lion.displayAnimal();
        elephant.displayAnimal();
        crocodile.displayAnimal();

        Zoo zoo1 = new Zoo("belv", "centre ville", 50);
        zoo1.addAnimal(lion, 0);
        zoo1.addAnimal(elephant, 1);
        zoo1.addAnimal(crocodile, 2);

        zoo1.displayZoo();

                          

    }
}