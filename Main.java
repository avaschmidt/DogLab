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
        ArrayList<Animal>animals = new ArrayList<Animal>();
        animals.add(new Dog("George"));
        animals.add(new Yorkshire("Buddy",3));
        animals.add(new Labrador("Luna","Yellow"));
        animals.get(0).setAge(1);
        animals.get(1).setAge(2);
        animals.get(2).setAge(3);
        for (Animal blah : animals){
            System.out.println(blah.getAge());
            blah.eat();
            //blah.bark(); does not work because these are animal objects, not dog objects
            System.out.println(((Dog)blah).bark());
        }

//    //Phase 1
//	Dog dog = new Dog("Spike");
//    Labrador lab = new Labrador("Rocko","Black");
//    Yorkshire yorkie = new Yorkshire("Princess",4);
//	System.out.println(dog.getName() + " says " + dog.bark());
//    System.out.println(lab.getName() + " says " + lab.bark());
//    System.out.println(yorkie.getName() + " says " + yorkie.bark());
//    yorkie.waddle();
//    lab.waddle(); //does not work bc it is not a method in the super class
//
//
//    //Phase 2
//       Dog[]dogs = new Dog[3];
//       dogs[0] = new Dog("Fido");
//       dogs[1] = new Yorkshire("Dolly",4);
//       dogs[2] = new Labrador("Max","Brown");
//       for(int i = 0; i<dogs.length; i++){
//           System.out.println(dogs[i].bark());
//       }
//       for(Dog doggy : dogs){
//           System.out.println(doggy.bark());
//       }
//        //Bark is in the super class Dog, and this is from an array of dogs, so it does not need to be casted
//        //The method is in the Labrador class, so it needs to be casted from a Dog to a Labrador to work
//        ((Labrador)dogs[2]).waddle();
//
//
//        ArrayList<Dog> dogs2 = new ArrayList<Dog>();
//        dogs2.add(new Dog("Spot"));
//        dogs2.add(new Yorkshire("Trixie",3));
//        dogs2.add(new Labrador("Pal","Yellow"));
//        for(int i = 0; i<dogs2.size(); i++){
//            System.out.println(dogs[i].bark());
//        }
//        for(Dog doggy2 : dogs2){
//            System.out.println(doggy2.bark());
//        }
//        Dog dogAt = dogs2.get(2);
//        ((Labrador)dogAt).waddle();
//
//


    }
}
