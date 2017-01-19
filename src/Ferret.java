/**
 * Created by miahbundy on 1/16/17.
 *  */

public class Ferret extends Animal {
    public String name = "";

    public Ferret(String name) {
        super(name);
    }

    public String getName(){
        return name;
    }

    @Override
    public void speak() {
        super.speak();
        System.out.println("The ferret squeaks");
    }

}

