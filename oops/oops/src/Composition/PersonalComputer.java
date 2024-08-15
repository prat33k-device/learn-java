package Composition;

// since we are allowed to only extends to 1 class, composition helps us to compose features from multiple classes
// defination: Composition is a way to make the combination of classes act like a single coherent object
public class PersonalComputer extends Product {

    private ComputerCase computerCase;
    private Monitor monitor;
    private Motherboard motherBoard;

    public PersonalComputer(String model, String manufacturer, ComputerCase computerCase, Monitor monitor, Motherboard motherBoard) {
        super(model, manufacturer);
        this.computerCase = computerCase;
        this.monitor = monitor;
        this.motherBoard = motherBoard;
    }

//    public ComputerCase getComputerCase() {
//        return computerCase;
//    }
//
//    public Monitor getMonitor() {
//        return monitor;
//    }
//
//    public Motherboard getMotherBoard() {
//        return motherBoard;
//    }

    public void drawLogo() {
        monitor.drawPixelAt(1200, 40, "purple");
    }

    public void powerUp() {
        computerCase.pressPowerButton();
        this.drawLogo();
    }
}
