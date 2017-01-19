
/**
 * Created by miahbundy on 1/16/17.
 */
public class Animal {
    public String name= "";
    public int price = 10;

    public Animal(String name){

        setName(name);
    }

    public void setName(String name){

        this.name = name;
    }

    public String getName() {

        return name;
    }

    public int getPrice(){
        return price;
    }

    public void speak() {

        System.out.println("The animal makes a sound");
    }


}
