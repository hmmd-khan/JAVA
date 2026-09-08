
public class Main {
    public static void main(String []args){
        // try{
        // //Objects with null, parameterized and copy constructor
        // RationalNumber r1=new RationalNumber();
        // RationalNumber r2=new RationalNumber(20,28);
        // RationalNumber r3=new RationalNumber(r2);
        // System.out.println("-----------------------------------");

        // System.out.printf("Total no of objects Created from RationalNumber: %s\n",RationalNumber.getObjectCount());
        // System.out.println("-----------------------------------");

        // System.out.printf("Add: %s \n",r1.add(r2));
        // System.out.printf("Subtract: %s \n",r2.subtract(r3));
        // System.out.printf("Multiply: %s \n",r3.multiply(r1));
        // System.out.printf("Divide: %s \n",r1.divide(r3));
        // System.out.println("-----------------------------------");

        // System.out.printf("checking equality of objects: %s \n",r2.equals(r3));
        // System.out.println("-----------------------------------");

        // System.out.printf("Trying to copy null object: %s\n",new RationalNumber(null));
        // }
        // catch(IllegalArgumentException e){
        //     System.out.println("Rejected: "+ e.getMessage());
        // }
        RationalNumber r1=new RationalNumber(10,5);
        RationalNumber r2=new RationalNumber(10,5);
        Object o1=r1;
        Object o2=r2;
        System.out.println(r1.equals(r2));
        System.out.println(o1.equals(o2));
        System.out.println(r1.equals(o2));
        System.out.println(o1.equals(r2));
        System.out.println(r1.equals(o1));
    }
}
