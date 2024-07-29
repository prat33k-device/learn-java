package Classes_and_Getter_methods;

class Car {

    // providing default values
    private String make = "Tesla";
    private String model = "Model X";
    private String color = "Gray";
    private int doors = 4;
    private boolean convertible = false;

    // Getters generated by Code>Generate>getters
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public String getColor() {
        return color;
    }
    public int getDoors() {
        return doors;
    }
    public boolean isConvertible() {
        return convertible;
    }

    public void describeCar() {
        System.out.println(doors + "-Doors " +
                color + " " +
                make + " " +
                model + " " +
                (convertible?"Convertible":"Non-Convertible")
        );
    }

}