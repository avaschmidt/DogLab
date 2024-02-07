// ****************************************************************
// Main.java
//
// A simple test class that creates a Dog and makes it speak.
//          
// ****************************************************************


import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
    //Phase 1
	Dog dog = new Dog("Spike");
    Labrador lab = new Labrador("Rocko","Black");
    Yorkshire yorkie = new Yorkshire("Princess",4);
	System.out.println(dog.getName() + " says " + dog.bark());
    System.out.println(lab.getName() + " says " + lab.bark());
    System.out.println(yorkie.getName() + " says " + yorkie.bark());
    yorkie.waddle();
    lab.waddle(); //does not work bc it is not a method in the super class


    //Phase 2
       Dog[]dogs = new Dog[3];
       dogs[0] = new Dog("Fido");
       dogs[1] = new Yorkshire("Dolly",4);
       dogs[2] = new Labrador("Max","Brown");
       for(int i = 0; i<dogs.length; i++){
           System.out.println(dogs[i].bark());
       }
       for(Dog doggy : dogs){
           System.out.println(doggy.bark());
       }

        ArrayList<Dog> dogs2 = new ArrayList<Dog>();
        dogs2.add(new Dog("Spot"));
        dogs2.add(new Yorkshire("Trixie",3));
        dogs2.add(new Labrador("Pal","Yellow"));
        for(int i = 0; i<dogs2.size(); i++){
            System.out.println(dogs[i].bark());
        }
        for(Dog doggy2 : dogs2){
            System.out.println(doggy2.bark());
        }

	
	

    }
}
