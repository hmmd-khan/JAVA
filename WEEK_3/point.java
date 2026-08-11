class Point{

    private int x;
    private int y;
    private static int objectCount;

    //NULL
    Point(){
        this.x=2;
        this.y=3;
        this.objectCount++;
    }

    //PARAMETERIZED
    Point(int x,int y){
        this.x=x;
        this.y=y;
        this.objectCount++;
    }

    //COPY
    Point(Point p){
        this.x=p.x;
        this.y=p.y;
        this.objectCount++;
    }

    //GET
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }

    //SET
    public void setXY(int x,int y){
        this.x=x;
        this.y=y;
    }

    boolean checkGrid(){
        if(this.x<=10 && this.x>=1 && this.y>=1 && this.y<=10){
            return true;
        }
        else 
            return false;
    }

    //PRINT
    void print(){
        if(checkGrid()){
            for(int i=1;i<=10;i++){
                for(int j=1;j<=10;j++){
                    if(i==this.x && j==this.y)
                        System.out.print(".");
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }
        else
            System.out.println("point is out of defined quadrant");
    }

    //MIDPOINT
    Point midPoint(Point p){
        return new Point((this.x+p.x)/2 ,(this.y+p.y)/2);
    }

    //SUBTRACT
    Point subtract(Point p){
       return new Point(this.x-p.x,this.y-p.y);
    }

    //ADDING POINTS 
    Point add(Point p){
        return new Point(this.x+p.x,this.y+p.y);
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
    double distancePoint(Point p){
        return Math.sqrt(Math.pow(this.x-p.x,2) + Math.pow(this.y-p.y,2));
    }

    //DISTANCE FROM ORIGIN TO POINT
    double distanceOrigin(){
        return Math.sqrt(Math.pow(this.x-0,2) + Math.pow(this.y-0,2));
    }

     //SLOPE OF LINE
    double slope(Point p){
        if(this.x!=p.x)
            return (this.x-p.x)/(this.y-p.y);
        else 
            return Double.POSITIVE_INFINITY;
            
    }

    //OBJECTCOUNT
    public int getObjectCount(){
        return this.objectCount;
    }

    //TOSTRING
    @Override
    public String toString(){
        return String.format("x is: "+this.x+" y is: "+this.y," Quadrant is:"+this.quadrant()+" Distance from origin is : "+this.distanceOrigin()+ "object count is: "+Point.objectCount);
        
     }

    //SHOW
    public void show(){
        System.out.println(toString());
    }
}

