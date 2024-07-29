public class Switch {

    public static void main(String[] args) {

        int v = 1;

        switch (v) {
            case 0:
                System.out.println("v is 0");
                break;
            case 1:
                System.out.println("v is 1");
                break;
            default:
                System.out.println("v is default");
        }

        for(int i = 1; i <=5; i++) {

            String name = switch (i) {
                case 1, 3, 4 -> "mary";
                case 2 -> "Tim";
                case 5 -> "harry";
                default -> "Anonymoous";
            };

            System.out.println(name);
        }
    }
}
