package Constructors;
class Student {

    String name;
    int age;

    // same name as class name
    // no return type
    // constructors are only called once when the objected is created
    // if we don't define our own constructor than java will create a default one on it's own
    Student() {
        System.out.println("Constructor called");
    }
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // copy constructor
    Student(Student s) {
        this.name = s.name;
        this.age = s.age;
    }

    public void printInfo() {
        System.out.println("name: " + this.name + ", age: " + this.age);
    }
}
