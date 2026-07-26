public class Main {

    public static void main(String[] args) {

        Car bmw = new Car();
        Car tesla = new Car();

        bmw.setDetails("BMW", "Black");
        tesla.setDetails("Tesla", "Red");

        bmw.startEngine();
        bmw.drive();
        bmw.moveFast();
        bmw.turnHeadlightsOn();
        bmw.turboMode();

        tesla.startEngine();
        tesla.drive();
        tesla.moveSlow();

        bmw.displayState();
        tesla.displayState();

        bmw.stopEngine();

        bmw.displayState();
        tesla.displayState();
    }
}
