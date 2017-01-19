/**
 * Created by miahbundy on 1/16/17.
 * */

public class Cat extends Animal {
    public String name = "";
    public String species = "...cat";

    public Cat(String name) {
        super(name);
    }

    public String getName(){
        return name;
    }

    @Override
    public void speak() {
        super.speak();
        System.out.println("The cat meows");
    }
}
