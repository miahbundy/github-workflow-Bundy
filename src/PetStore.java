import java.util.ArrayList;

/**
 * Created by miahbundy on 1/16/17.
 **/

public class PetStore implements Store{
    public ArrayList<Animal> availablePets = new ArrayList<Animal>();
    Animal cat1 = new Cat("Cindy the cat");
    Animal dog1 = new Dog("Mark the dog");
    Animal ferret1 = new Ferret("Jordan the ferret");


    public PetStore(){
        String c = sellAnimal(cat1);
        String d = sellAnimal(dog1);
        String f = sellAnimal(ferret1);

    }


    public void showAvailablePets(){

        if (availablePets.size() == 0)
            System.out.println("Sorry, there are no pets to buy");

        else {

            System.out.println("There are " + availablePets.size() + " pets available to buy. They are listed below: ");
            for (int i = 0; i < availablePets.size(); i++) {
                System.out.println(availablePets.get(i).getName());
            }
            System.out.println();
        }
    }

    public String sellAnimal(Animal pet){

        pet = new Animal(pet.name);
        availablePets.add(pet);
        return pet.name;
    }


    public String buyAnimal(Animal pet){

        String purchaseNote = "";
        Boolean found = false;

        if (availablePets.size() == 0)
            purchaseNote = "Sorry, there are no pets to buy";

        else {

            for (int i = 0; i < availablePets.size(); i++) {
                if (availablePets.get(i).name.equals(pet.name)){
                    availablePets.remove(i);
                    found = true;
                    purchaseNote = "You have purchased " + pet.name;
                    break;} }
        }

        if (!found && availablePets.size() > 0)
            purchaseNote = "Sorry, that pet (" + pet.name + ") is not available";


        return purchaseNote;
    }

}
