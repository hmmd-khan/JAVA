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
        objectCount++;
    }

    //parameterized constructure
    Car(float speed,float angle,boolean isEngineStart,int gear){
        this.speed=speed;
        this.angle=angle;
        this.isEngineStart=isEngineStart;
        this.gear=gear;
        objectCount++;
    }

    //copy constructor
    Car(Car other){
        this.speed=other.speed;
        this.angle=other.angle;
        this.isEngineStart=other.isEngineStart;
        this.gear=other.gear;
        objectCount++;
    }

    //objectCount constructor
    public static int getObjectCount(){
        return objectCount;
    }

    boolean startEngine(){
        this.isEngineStart=true;
        return this.isEngineStart;
    }

    boolean stopEngine(){
        this.isEngineStart=false;
        return this.isEngineStart;
    }

    private boolean checkEngine(){
        if(!isEngineStart){
            System.out.println("Engine is off, start Engine to perform task");
            return false;
        }
        else return true;
    }

    //getter
    float getSpeed(){
       return this.speed;
    }

    //getter
    float getAngle(){
        return this.angle;
    }

    //setter
    public void setSpeedAngle(float speed,float angle){
        this.speed=speed;
        this.angle=angle;
    }

    void accelerates(float acc){
        if(!checkEngine()) return;
        this.speed+=acc;
    }

    void breakes(){
        if(!checkEngine()) return;
        this.speed=0;
    }

    void turnRight(){
        if(!checkEngine()) return;
        if(this.angle<=0)
            this.angle=360;
        this.angle-=90;
    }

    void turnLeft(){
        if(!checkEngine()) return;
        if(this.angle>=360)
            this.angle=0;
        this.angle+=90;
    }

    void gearChange(int gear){
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

    //toString constructor
    public String toString(){
        return "speed is:"+ speed +",\nangle is:"+angle+",\nEngine state:"+isEngineStart+"\nGear is: "+this.gear;
    }

    //show constructor
    void show(){
        System.out.println(this.toString());
    }
}
