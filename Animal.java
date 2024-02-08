//Phase 3
public abstract class Animal {
    private int age;

    public Animal(){
        age = 0;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }
    //I had errors because I needed to make the class abstract as well
    //I also had to override the method in the Dog class
    public abstract void eat();
}

