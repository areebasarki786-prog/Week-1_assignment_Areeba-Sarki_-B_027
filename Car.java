public class Car {

    // Attributes
    private String brand;
    private String color;
    private int speed;
    private boolean engineOn;
    private int fuelLevel;
    private boolean headlightsOn;

    // Constructor
    public Car() {
        brand = "Unknown";
        color = "Unknown";
        speed = 0;
        engineOn = false;
        fuelLevel = 100;
        headlightsOn = false;
    }

    // Set Details
    public void setDetails(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    // Start Engine
    public void startEngine() {
        engineOn = true;
        System.out.println(brand + " Engine Started.");
    }

    // Stop Engine
    public void stopEngine() {
        engineOn = false;
        speed = 0;
        System.out.println(brand + " Engine Stopped.");
    }

    // Drive
    public void drive() {

        if (engineOn) {
            System.out.println("Start the engine first.");
            return;
        }

        speed = 20;
        fuelLevel -= 5;

        System.out.println(brand + " is driving.");
    }

    // Move Fast
    public void moveFast() {

        if (engineOn) {
            System.out.println("Engine is OFF.");
            return;
        }

        speed += 20;

        if(speed > 180)
            speed = 180;

        fuelLevel -= 10;

        System.out.println(brand + " moved fast.");
    }

    // Move Slow
    public void moveSlow() {

        speed -= 20;

        if(speed < 0)
            speed = 0;

        System.out.println(brand + " slowed down.");
    }

    // Turn Headlights ON
    public void turnHeadlightsOn() {

        headlightsOn = true;

        System.out.println("Headlights ON");
    }

    // Turbo Mode
    public void turboMode() {

        if(engineOn) {
            System.out.println("Engine OFF.");
            return;
        }

        speed += 50;

        if(speed > 200)
            speed = 200;

        fuelLevel -= 15;

        System.out.println("Turbo Mode Activated.");
    }

    // Display State
    public void displayState() {

        System.out.println("\n----- Car Status -----");
        System.out.println("Brand : " + brand);
        System.out.println("Color : " + color);
        System.out.println("Speed : " + speed);
        System.out.println("Engine : " + engineOn);
        System.out.println("Fuel : " + fuelLevel + "%");
        System.out.println("Headlights : " + headlightsOn);
        System.out.println("----------------------");
    }

}
