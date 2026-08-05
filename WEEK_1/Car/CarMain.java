public class CarMain{
    public static void main(String[]args){
      
        //object with null
        Car bmw=new Car();
        bmw.show();

        //object with parameterized
        Car audi =new Car(5,45,true,1);
        //toString and show constructor
        audi.show();

        //copy
        Car tesla=new Car(bmw);
        tesla.show();

        //object count
        System.out.println(Car.getObjectCount());

        //engine start
        audi.startEngine();
        bmw.startEngine();
        tesla.startEngine();

        //getters
        System.out.println(bmw.getSpeed());
        System.out.println(bmw.getAngle());

        //setter
        bmw.setSpeedAngle(20,30);
        
        //changeGear
        bmw.gearChange(3);
        bmw.show();

        //accelerate
        audi.accelerates(30);
        audi.show();

        //breaks
        tesla.breakes();

        //moveright
        bmw.turnRight();
        bmw.show();

        //moveleft
        audi.turnLeft();
        audi.show();



    }
}