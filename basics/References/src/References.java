class House {
    public String color;
    House(String color) {
        this.color = color;
    }
}

public class References {

    public static void main(String[] args) {


        House h1 = new House("red");
        House h2 = h1;                     // this will create a reference to h1 object

        System.out.println("h1: " + h1.color + " h2: " + h2.color); // red red

        h1.color = "green";

        System.out.println("h1: " + h1.color + " h2: " + h2.color); // green green
    }

}
