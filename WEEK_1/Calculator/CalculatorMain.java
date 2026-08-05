public class CalMain {

    public static void main(String[] args) {

        // Null Constructor
        Calculator casio = new Calculator();

        // Parameterized Constructor
        Calculator citizen = new Calculator(4,5);

        // Copy Constructor
        Calculator canon = new Calculator(casio);

        // Show Objects
        casio.show();
        citizen.show();
        canon.show();

        // Object Count
        System.out.println(Calculator.getObjectCount());

        //getter
        System.out.println(casio.getNum1());
        System.out.println(citizen.getNum2());

        //setter
        casio.setNum1Num2(3, 8);
        casio.show();

        // Addition
        casio.add(20, 10);
        casio.show();

        // Subtraction
        citizen.subtract(20, 10);
        citizen.show();

        // Multiplication
        canon.multiply(20, 10);
        canon.show();

        // Division
        citizen.divide(20, 10);
        citizen.show();

        // Division by Zero (Edge Case)
        casio.divide(20, 0);
        casio.show();

        // Modulus
        canon.modulus(20, 6);
        canon.show();

        // Average
        casio.average(20, 10);
        casio.show();

    }
}