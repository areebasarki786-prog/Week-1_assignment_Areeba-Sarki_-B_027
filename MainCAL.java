public class Main {

    public static void main(String[] args) {

        Calculator cal = new Calculator();

        System.out.println("Addition = " + cal.add(10,5));
        System.out.println("Subtraction = " + cal.subtract(10,5));
        System.out.println("Multiplication = " + cal.multiply(10,5));
        System.out.println("Division = " + cal.divide(10,5));
        System.out.println("Average = " + cal.average(10,20));
        System.out.println("Power = " + cal.power(2,5));

        // Edge Case
        System.out.println(cal.divide(10,0));

    }
}
