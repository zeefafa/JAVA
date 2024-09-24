public class Zoo {
    Animal[] animals = new Animal[25];
    String  name;
    String  city;
    int nbrCages;

    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }

    public void addAnimal(Animal animal,int i) {
        if(i<25) {
            animals[i]=animal;
        }
        else {
            System.out.println("Cannot add more animals, zoo is full!");
        }
    }

    public void displayZoo() {
        System.out.println("Zoo Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Number of Cages: " + nbrCages);
    }
}
