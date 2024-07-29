import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {

        String name, age;

        try {
            name = System.console().readLine("Hi, what's your name: ");
            age = System.console().readLine("and the age; ");
        } catch (NullPointerException e) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Hi, what's your name: ");
            name = scanner.nextLine();
            System.out.print("and the age: ");
            age = scanner.nextLine();
            scanner.close();
        }

        System.out.println("you are " + name + "and your age is " + Integer.parseInt(age) + "!");
    }
}
