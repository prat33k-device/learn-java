package Composition;

public class Main {
    public static void main(String[] args) {
        ComputerCase theCase = new ComputerCase("2208", "dell", "240");
        Monitor theMonitor = new Monitor("27inch", "Acer", 27,"2540 X 1440");
        Motherboard theMotherBoard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PersonalComputer thePC = new PersonalComputer("2208", "dell", theCase, theMonitor, theMotherBoard);

//        thePC.getMonitor().drawPixelAt(10,10,"red");
//        thePC.getMotherBoard().loadProgram("Window OS");
//        thePC.getComputerCase().pressPowerButton();

        thePC.powerUp();
    }
}
