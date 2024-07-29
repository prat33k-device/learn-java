package Static;

class Dog {

    public static String name;
    public static void bark() {
        System.out.println("woof");
    }

    public Dog(String name) {
        Dog.name = name;
    }
    public String name() {
        return Dog.name;
    }
}

public class Static {
    public static void main(String[] args) {

        Dog.bark();
        System.out.println(Dog.name);

        Dog rex = new Dog("rex");
        Dog fluffy = new Dog("fluffy");

        System.out.println(rex.name());       // fluffy
        System.out.println(fluffy.name());    // fluffy
        System.out.println(Dog.name);         // fluffy
    }
}
