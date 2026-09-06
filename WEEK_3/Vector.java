public class Vector {
    private float icap;
    private float jcap;
    private static int objectCount;

    //null
    public Vector(){
        this.icap=0;
        this.jcap=0;
        Vector.objectCount++;
    }

    //parameterized
    public Vector(float icap,float jcap){
        validateComponents(icap,jcap);
        this.icap=icap;
        this.jcap=jcap;
        Vector.objectCount++;
    }

    //copy
    public Vector(Vector obj){
        this.icap=obj.icap;
        this.jcap=obj.jcap;
        Vector.objectCount++;
    }

    //object count
    public static int getObjectCount(){
        return Vector.objectCount;
    }

    //getters
    public float getIcap(){
        return this.icap;
    }

    public float getJcap(){
        return this.jcap;
    }

    //setters
    public void setIcapJcap(float icap,float jcap){
        validateComponents(icap,jcap);
        this.icap=icap;
        this.jcap=jcap;
    }

    //dot product
    public double dotProduct(Vector obj){
        return  (this.icap*obj.icap)+(this.jcap*obj.jcap);
    }

    //cross product
    //(Ay*Bz-AzBy)-(Ax*Bz-AzBx)+(Ax*By-Ay*Bx)
    public String crossProduct(Vector obj) {
    return (this.icap * obj.jcap)-(this.jcap * obj.icap)+" k";
    }

    //projection on other vector 
    public Vector projection(Vector obj){
        float scaler= (float)(this.dotProduct(obj)/(obj.magnitude()*obj.magnitude()));
        return new Vector(scaler* obj.icap,scaler*obj.jcap);
    }

    //check perpendicular on B by formula A.B=0
    public boolean isPerpendicular(Vector obj){
        return Math.abs(this.dotProduct(obj)) < 0.000001f;
    }

    //magnitude
    public double magnitude(){
        return Math.sqrt((this.icap*this.icap)+(this.jcap*this.jcap));
    }

    //direction
    //tan^-1(y/x)
    public double direction(){
        return Math.atan2(this.jcap,this.icap);
    }

    //validations
    private static void validateComponents(float icap,float jcap){
        if(!Float.isFinite(icap)||!Float.isFinite(jcap))
            throw new IllegalArgumentException("Both components must be finite");
    }

    //tostring
    public String toString(){
        return "{ icap: "+this.icap+" jcap: "+this.jcap+" }";
    }

    //show
    public void show(){
    System.out.println(this.toString());
    }
}
