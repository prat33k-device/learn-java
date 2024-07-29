class Test {
    // compile time polymorphism (function overloading)
    public void printInfo(String name) {
        System.out.println(name);
    }
    public void printInfo(int age) {
        System.out.println(age);
    }
    public void printInfo(String name, int age) {
        System.out.println(name);
    }
}

public class Polymorphism {

}
