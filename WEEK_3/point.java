class Point{
    private float x;
    private float y;
    private static int objectCount;

    //NULL
    Point(){
        validateCoordinates(this.x,this.y);
        this.x=0;
        this.y=0;
        Point.objectCount++;
    }

    //PARAMETERIZED
    Point(float x,float y){
        validateCoordinates(this.x,this.y);
        this.x=x;
        this.y=y;
        Point.objectCount++;
    }

    //COPY
    Point(Point p){
        this.x=p.x;
        this.y=p.y;
        Point.objectCount++;
    }

    //GET
    public float getX(){
        return this.x;
    }
    public float getY(){
        return this.y;
    }

    //SET
    public void setXY(float x,float y){
        validateCoordinates(this.x,this.y);
        this.x=x;
        this.y=y;
    }

    //translating the co-ordinate of point
    public void translatePoint(float x,float y){
        validateTranslation(this.x,x,this.y,y);
        this.x=x;
        this.y=y;
    }

    //Finding MIDPOINT of two points
    public Point midPoint(Point obj){
        return new Point((this.x+obj.x)/2 ,(this.y+obj.y)/2);
    }

    //Subtracting two Points which results in a vector 
    public Vector subtract(Point obj){
       return new Vector(this.x-obj.x,this.y-obj.y);
    }

    //QUADRANT OF POINT
    String quadrant(){
        if(this.x>0 && this.y>0)
            return "Quadrant I";

        else if(this.x<0 && this.y>0)
            return "Quadrant II";

        else if(this.x<0 && this.y<0)
            return "QUADRANT III";

        else if(this.x>0 && this.y<0)
            return "QUADRANT IV";
        
        else if(this.x==0 && this.y==0)
            return "ORIGIN";

        else if(this.x==0)
            return "Y-AXIS";

        else 
            return "X-AXIS";
    }

    //DISTANCE OF POINT TO POINT
    double PointDistance(Point obj){
        validateDistance(this.x, obj.x, this.y, obj.y);
        return Math.sqrt(Math.pow(this.x-obj.x,2) + Math.pow(this.y-obj.y,2));
    }

    //DISTANCE FROM ORIGIN TO POINT
    double originDistance(){
        return Math.sqrt(Math.pow(this.x-0,2) + Math.pow(this.y-0,2));
    }

     //SLOPE OF LINE
    double slope(Point obj){
        validateSlope(this.x, obj.x);
        return (this.y-obj.y)/(this.x-obj.x);     
    }

    //validations
    private static void validateCoordinates(float x, float y){
        if(!Float.isFinite(x)||!Float.isFinite(y))
            throw new IllegalArgumentException("Both Components must be finite");
    }

    private static void validateTranslation(float x1,float x2,float y1,float y2){
        if(x1==x2 && y1==y2 ||!Float.isFinite(x2)||!Float.isFinite(y2))
            throw new IllegalArgumentException("Coordinates must be finite and unique.");

    }

    private static void validateSlope(float x1 ,float x2){
        if(x1==x2)
            throw new  IllegalArgumentException("Slope cannot be found because The line is perfectly vertical.\n\t  x1 and x2 should be unique.");
    }

    private static void validateDistance(float x1 ,float x2,float y1,float y2){
        if(x1==x2&&y1==y2)
            throw new  IllegalArgumentException("points must not coincide.");
    }

    //OBJECTCOUNT
    public static int getObjectCount(){
        return Point.objectCount;
    }

    //TOSTRING
    @Override
    public String toString(){
        return "x is: "+this.x+" y is: "+this.y;
    }

    //SHOW
    public void show(){
        System.out.println(this.toString());
    }
}

