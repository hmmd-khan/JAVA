public class CarMain{
    public static void main(String[]args){
        try{
        //object with null
        Car bmw=new Car();

        //object with parameterized
        Car audi =new Car(5,45,1);

        //copy
        Car tesla=new Car(bmw);

        System.out.println("--------------------------");
        //object count
        System.out.printf("ToTal No of Cars Created: %d\n",Car.getObjectCount());

        System.out.println("--------------------------");
        System.out.println("Audi before gear change");
        audi.show();
        System.out.println("--------------------------");

        System.out.println("Audi after gear change");
        audi.gearChange(3);
        audi.show();
        System.out.println("--------------------------");

        System.out.printf("Is bmw enging start: %b\n",bmw.getIsEngineStart());
        System.out.println("Using setter on bmw while Engine being off");
        //setter
        bmw.setSpeedAngleGear(25,30,2);
        System.out.println("--------------------------");

        System.out.println("Using setter on bmw after turning Engine ON");
        System.out.println("passing 1000 km/h of speed in setter");
        bmw.startEngine();
        bmw.setSpeedAngleGear(1000, 30,2);
        bmw.show();
        System.out.println("--------------------------");
        }

        catch(IllegalArgumentException exception) {
        System.out.println("Rejected: " + exception.getMessage());
        }
    }
}
