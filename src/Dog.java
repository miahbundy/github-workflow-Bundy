/**
 * Created by miahbundy on 1/16/17.
 * */

public class Dog extends Animal {
    public String name = "";

    public Dog(String name) {
        super(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        super.setName(name);
        this.name = name;
    }

    @Override
    public void speak() {
        super.speak();
        System.out.println("The dog barks");
    }


}

