public class Calculator {
    private double num1;
    private double num2;
    private double calculate;
    private static int objectCount = 0;

    // Null Constructor
    Calculator() {
        this.num1=1;
        this.num2=1;
        objectCount++;
    }

    // Copy Constructor
    Calculator(Calculator other) {
        this.num1=other.num1;
        this.num2=other.num2;
        this.calculate=0;
        objectCount++;
    }

    // Parameterized Constructor
    Calculator(double num1,double num2) {
        this.num1=num1;
        this.num2=num2;
        this.calculate=0;
        objectCount++;
    }

    // Object Count costructor
    public static int getObjectCount() {
        return objectCount;
    }

    //getter constructor
    double getNum1(){
        return this.num1;
    }

    double getNum2(){
        return this.num2;
    }

    void setNum1Num2(double num1,double num2){
        this.num1=num1;
        this.num2=num2;
    }

    void add(double a, double b) {
        this.calculate=a+b;
    }

    void subtract(double a, double b) {
        this.calculate=a-b;
    }

    void multiply(double a, double b) {
        this.calculate=a*b;
    }

    void divide(double a, double b) {

        if (b == 0) {
            System.out.println("Division by zero is not allowed.");
        }
        this.calculate=a/b;
    }

    void modulus(double a, double b) {
       this.calculate=a%b;
    }

    void average(double a, double b) {
       this.calculate=(a+b)/2;
    }
 
    //toString constructor
    public String toString() {
        return "Num 1:"+num1+"\nNum 2:"+num2+"\ncalculate :"+this.calculate;
    }

    //show consructor
    void show() {
        System.out.println(this.toString());
    }
}