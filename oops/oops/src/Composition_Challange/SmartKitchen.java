package Composition_Challange;

public class SmartKitchen {
    private CoffeeMaker brewMaster;
    private DishWasher dishWasher;
    private Refrigerator iceBox;

    public SmartKitchen() {
        brewMaster = new CoffeeMaker();
        iceBox = new Refrigerator();
        dishWasher = new DishWasher();
    }
    public void addWater() {
        System.out.println("adding water to coffee maker");
        this.brewMaster.setHasWorkToDo(true);
    }

    public void pourMilk() {
        System.out.println("refrigerator is pouring milk");
        this.iceBox.setHasWorkToDo(true);
    }

    public void loadDishwasher() {
        System.out.println("loading dishwasher");
        this.dishWasher.setHasWorkToDo(true);
    }

    public void setKitchenState(boolean coffeeFlag, boolean fridgeFlag, boolean dishWasherFlag) {
        this.brewMaster.setHasWorkToDo(coffeeFlag);
        this.iceBox.setHasWorkToDo(fridgeFlag);
        this.dishWasher.setHasWorkToDo(dishWasherFlag);
    }

    public void doKitchenWork() {
        this.brewMaster.brewCoffee();
        this.iceBox.orderFood();
        this.dishWasher.doDishes();
    }

    public CoffeeMaker getBrewMaster() {
        return brewMaster;
    }

    public DishWasher getDishWasher() {
        return dishWasher;
    }

    public Refrigerator getIceBox() {
        return iceBox;
    }
}

class Refrigerator {
     private boolean hasWorkToDo = false;

     public void setHasWorkToDo(boolean hasWorkToDo) {
         this.hasWorkToDo = hasWorkToDo;
     }
    public void orderFood() {
        if(this.hasWorkToDo) {
            this.hasWorkToDo = false;
            System.out.println("order food");
        }
    }
}

class DishWasher {
    private boolean hasWorkToDo = false;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
    public void doDishes() {
        if(this.hasWorkToDo) {
            this.hasWorkToDo = false;
            System.out.println("doing dishes");
        }
    }
}

class CoffeeMaker {
    protected boolean hasWorkToDo = false;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
    public void brewCoffee() {
        if(this.hasWorkToDo) {
            this.hasWorkToDo = false;
            System.out.println("brewing coffee");
        }
    }
}
