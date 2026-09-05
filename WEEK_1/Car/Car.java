public class Car {
    private float speed;
    private float angle;
    private boolean isEngineStart;
    private int gear;
    private static int objectCount=0; 

    //null constructor
    Car(){
        this.speed=0;
        this.angle=0;
        this.gear=0;
        this.isEngineStart=false;
        Car.objectCount++;
    }

    //parameterized constructure
    Car(float speed,float angle,int gear){
        validateAngle(angle);
        validateGear(gear);
        validateSpeed(speed);
        this.speed=speed;
        this.angle=angle;
        this.isEngineStart=true;
        this.gear=gear;
        Car.objectCount++;
    }

    //copy constructor
    Car(Car other){
        this.speed=other.speed;
        this.angle=other.angle;
        this.isEngineStart=other.isEngineStart;
        this.gear=other.gear;
        Car.objectCount++;
    }

    //objectCount constructor
    public static int getObjectCount(){
        return objectCount;
    }

    //Returns a true boolean value which means engine is ON
    void startEngine(){
        this.isEngineStart=true;
        //return this.isEngineStart;
    }

    //Returns a false boolean value which means engine is OFF
    boolean stopEngine(){
        this.isEngineStart=false;
        return this.isEngineStart;
    }

    //getter
    float getSpeed(){
       return this.speed;
    }

    //getter
    float getAngle(){
        return this.angle;
    }

    public int getGear(){
        return this.gear;
    }

    public boolean getIsEngineStart(){
        return this.isEngineStart;
    }

    //setter
    public void setSpeedAngleGear(float speed,float angle,int gear){
        if(!checkEngine())return;
        validateGear(gear);
        validateAngle(angle);
        validateSpeed(speed);
        this.gear=gear;
        this.speed=speed;
        this.angle=angle;
    }

    //Increases the speed off Car
    void accelerates(float acc){
        validateSpeed(acc);
        if(!checkEngine()) return;
        this.speed+=acc;
    }

    //Apply Breaks which results in decreasing speed to zero
    void breakes(){
        if(!checkEngine()) return;
        this.speed=0;
    }

    //Turns the Car Direction into right
    void turnRight(){
        if(!checkEngine()) return;
        if(this.angle<=0)
            this.angle=360;
        this.angle-=90;
    }

    //Turns the Car Direction into left
    void turnLeft(){
        if(!checkEngine()) return;
        if(this.angle>=360)
            this.angle=0;
        this.angle+=90;
    }

    //Changes the Gear of Car 
    void gearChange(int gear){
        validateGear(gear);
        if(!checkEngine()) return;
        
        switch (gear) {
            case 0:
                this.speed=0;
                this.gear=gear;
                break;
            case 1:
                this.speed=10;
                this.gear=gear;
                break;
            case 2:
                this.speed=25;
                this.gear=gear;
                break;
            case 3:
                this.speed=50;
                this.gear=gear;
                break;
            case 4:
                this.speed=85;
                this.gear=gear;
                break;
            default:
                break;
        }
    }

    //Validates the Engine Current State
    private boolean checkEngine(){
        if(!isEngineStart){
            System.out.println("Engine is off, start Engine to perform task");
            return false;
        }
        else return true;
    }

    private void validateAngle(float angle){
        if(!Double.isFinite(angle)||angle>360||angle<0){
            throw new IllegalArgumentException("Angle should be finite, less than 360 and greater than 0");
        }
    }

    private void validateSpeed(float speed){
        if(!Double.isFinite(speed)||speed>85||gear<0){
            throw new IllegalArgumentException("Speed should be finite, less than 85 and greater than 0");
        }
    }

    private void validateGear(int gear){
        if(!Double.isFinite(gear)||gear>4||gear<0){
            throw new IllegalArgumentException("Gear should be finite and greater than zero");
        }
    }

    //toString constructor
    public String toString(){
        return "speed is:"+ this.speed +"km/h,\nangle is:"+this.angle+",degree\nEngine state:"+this.isEngineStart+"\nGear is: "+this.gear;
    }

    //show constructor
    void show(){
        System.out.println(this.toString());
    }
}
