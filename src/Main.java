/**
 * Created by miahbundy on 1/16/17.
 */
public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello World!");


        PetStore pt = new PetStore();

        System.out.println("These are the animals initially available in the PetStore: ");
        pt.showAvailablePets();

        Animal cat2 = new Cat("Lilly the cat");
        Animal cat3 = new Cat("Jill the cat");

        Animal dog2 = new Dog("Bo the dog");
        Animal dog3 = new Dog("Liam the dog");

        Animal ferret2 = new Ferret("Harper the ferret");
        Animal ferret3 = new Ferret("Dakota the ferret");





        pt.sellAnimal(cat2);
        System.out.println("You have sold " + cat2.name + " to the PetStore");

        pt.sellAnimal(cat3);
        System.out.println("You have sold " + cat3.name + " to the PetStore");

        pt.sellAnimal(dog2);
        System.out.println("You have sold " + dog2.name + " to the PetStore");
        pt.sellAnimal(dog3);
        System.out.println("You have sold " + dog3.name + " to the PetStore");

        pt.sellAnimal(ferret2);
        System.out.println("You have sold " + ferret2.name + " to the PetStore");
        pt.sellAnimal(ferret3);
        System.out.println("You have sold " + ferret3.name + " to the PetStore");

        System.out.println();
        System.out.println("Animal sounds");
        dog3.speak();
        cat2.speak();
        ferret3.speak();
        System.out.println();

        pt.showAvailablePets();

        System.out.println(pt.buyAnimal(dog3));

        pt.showAvailablePets();

        System.out.println(pt.buyAnimal(dog2));
        System.out.println(pt.buyAnimal(cat3));

        pt.showAvailablePets();
        //this is just showing that you can't buy an animal that you've already bought/is not at the Store
        System.out.println(pt.buyAnimal(dog2));


    }
}
