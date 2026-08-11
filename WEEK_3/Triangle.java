public class Triangle {
    private line sideA;
    private line sideB;
    private line sideC;
    private static int objectCount;

    Triangle(){
        this.sideA=sideA;   
        this.sideB=sideB;   
        this.sideC=sideC;   
        this.objectCount++;
    }
    Triangle(line SideA,line SideB,line SideC){
        this.sideA=sideA;   
        this.sideB=sideB;   
        this.sideC=sideC;
        this.objectCount++;   
    }
    Triangle(Triangle T){
        this.sideA=T.sideA;   
        this.sideB=T.sideB;   
        this.sideC=T.sideC;  
        this.objectCount++; 
    }

    int getObjectCount(){
        return this.objectCount;
    }

    line getSideA(){
        return this.sideA;
    }

    line getSideB(){
        return this.sideB;
    }

    line getSideC(){
        return this.sideC;
    }

    void setSides(line sideA,line sideB,line sideC){
        this.sideA=sideA;   
        this.sideB=sideB;   
        this.sideC=sideC;
    }

    @Override
    public String toString(){
        return " side A: "+this.sideA+" side B: "+this.sideB+" side C: "+" object count: "+Triangle.objectCount;
    }

    void show(){
        System.out.println(this.toString());
    }
}
