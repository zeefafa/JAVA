package tn.esprit.gestionzoo.entities;

public class Zoo {

        static final int NUMBER_OF_CAGES = 25;
        private Animal[] animals;
        private String name, city;
        private int nbrAnimals;

        int animalCount = 0;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            if (name != null && !name.isEmpty()) {
                this.name = name;
            } else {
                System.out.println("Error: Zoo name cannot be empty. Setting name to 'Unknown Zoo'.");
                this.name = "Unknown Zoo";
            }
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public Zoo(String name, String city , int NUMBER_OF_CAGES) {
            animals = new Animal[NUMBER_OF_CAGES];
            this.name = name;
            this.city = city;
        }

        static Zoo comparerZoo(Zoo z1, Zoo z2) {
            if (z1.nbrAnimals > z2.nbrAnimals)
                return z1;
            return z2;
        }

        void displayZoo() {
            System.out.println("Name: " + name + ", City: " + city + ", N° Cages: " + NUMBER_OF_CAGES + " N° animals: " + nbrAnimals);
        }

        public boolean addAnimal(Animal animal) {
            if (isZooFull()) {
                System.out.println("Cannot add animal, the zoo is full.");
                return false;
            }
            animals[animalCount] = animal;
            animalCount++;
            return true;
        }

        boolean removeAnimal(Animal animal) {
            int indexAnimal = searchAnimal(animal);
            if (indexAnimal == -1)
                return false;
            for (int i = indexAnimal; i < nbrAnimals; i++) {
                animals[i] = animals[i + 1];
            }
            this.nbrAnimals--;
            animals[nbrAnimals] = null;
            return true;
        }

        public void displayAnimals() {
            System.out.println("List of animals of " + name + ":");
            for (int i = 0; i < nbrAnimals; i++) {
                System.out.println(animals[i]);
            }
        }

        public int searchAnimal(Animal animal) {
            for (int i = 0; i < animalCount; i++) {  // animalCount keeps track of added animals
                if (animals[i].getName().equals(animal.getName())) {
                    return i;  // Return the index if the animal's name matches
                }
            }
            return -1;  // Return -1 if the animal is not found
        }


        boolean isZooFull() {
            return nbrAnimals >= NUMBER_OF_CAGES;
        }

        @Override
        public String toString() {
            return "Name: " + name + ", City: " + city + ", N° Cages: " + NUMBER_OF_CAGES + " N° animals: " + nbrAnimals;
        }

}
