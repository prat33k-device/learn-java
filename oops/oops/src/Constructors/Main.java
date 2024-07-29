package Constructors;
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("prateek", 24);
        s1.printInfo();

        Student s2 = new Student(s1);
        s2.printInfo();


        Account acc1 = new Account();
        System.out.println(acc1.getBalance());
        System.out.println(acc1.getInfo());
        acc1.depositFunds(72.253);
        System.out.println(acc1.getBalance());
    }
}
