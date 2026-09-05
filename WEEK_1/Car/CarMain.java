public class CarMain{
    public static void main(String[]args){
      
        //object with null
        Car bmw=new Car();
        bmw.show();

        System.out.println("--------------------------");

        //object with parameterized
        Car audi =new Car(5,45,true,1);
        //toString and show constructor
        audi.show();

        System.out.println("--------------------------");

        //copy
        Car tesla=new Car(bmw);
        tesla.show();

        System.out.println("--------------------------");

        //object count
        System.out.printf("ToTal No of Cars Created: %d",Car.getObjectCount());

        System.out.println("--------------------------");

        //engine start
        audi.startEngine();
        bmw.startEngine();
        tesla.startEngine();

        System.out.println("--------------------------");

        //getters
        System.out.println(bmw.getSpeed());
        System.out.println(bmw.getAngle());

        System.out.println("--------------------------");

        //setter
        bmw.setSpeedAngle(20,30);
        
        System.out.println("--------------------------");

        //changeGear
        bmw.gearChange(3);
        bmw.show();

        System.out.println("--------------------------");

        //accelerate
        audi.accelerates(30);
        audi.show();

        System.out.println("--------------------------");

        //breaks
        tesla.breakes();

        System.out.println("--------------------------");

        //moveright
        bmw.turnRight();
        bmw.show();

        System.out.println("--------------------------");

        //moveleft
        audi.turnLeft();
        audi.show();

        System.out.println("--------------------------");


    }
}
