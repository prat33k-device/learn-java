// base class, parent class
class Shape {
    String color;
    public void area() {
        System.out.println("display area");
    }
}

// subclass, child class
class Triange extends Shape {
    public void area(int l, int h) {
        System.out.println(1/2 * l*h);
    }
}

class EquilateralTriangle extends Triange {

}

// can't inheret multiple class
public class Inheretance {
    public static void main(String[] args) {
        Triange t1 = new Triange();
        t1.color = "red";
    }
}
