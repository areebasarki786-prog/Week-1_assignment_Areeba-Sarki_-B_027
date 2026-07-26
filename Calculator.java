public class Calculator {

    // Attributes
    private boolean state;
    private double num1;
    private double num2;

    // Constructor
    public Calculator() {

        this.state = true;
        this.num1 = 0;
        this.num2 = 0;
    }
    
    public Calculator(double num1, double num2){

        this.num1 = num1;
        this.num2 = num2;
    }


    public double add(double num1, double num2) {

        return this.num1 + this.num2;
    }

    public double subtract(double num1, double num2) {

        return this.num1 - this.num2;
    }

    public double multiply(double num1, double num2) {

        return this.num1 * this.num2;
    }

    public double divide(double num1, double num2) {

        if(num2 == 0) {

            System.out.println("Division by zero is not allowed.");

            return 0;
        }

        return this.num1 / this.num2;
    }

    public double average(double num1, double num2) {

        return (this.num1 + this.num2) / 2;
    }

    public double power(double num1, double num2) {

        return Math.pow(this.num1, this.num2);
    }

}
