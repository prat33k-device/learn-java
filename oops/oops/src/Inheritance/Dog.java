package Inheritance;

public class Dog extends Animal{

    // if you don't call super(), java makes it for you using super's default constructor
    // if the super (parent) class don't have a default constructor, then you must explicitly call super() in all of your constructors

    private String earShape;
    private String tailShape;

    public Dog() {
        super("Mutt", "big", 30);
    }

    public Dog(String type, double weight) {
        this(type, weight, "Perky", "Curled");
    }
    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "small" : (weight < 35 ? "medium" : "large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public void makeNoise() {
        if(type == "wolf") {
            System.out.println("ow wooo!");
        } else {
            System.out.println("bark");
        }
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        System.out.println("called from Dog subclass");
    }

}
