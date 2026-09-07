public class Line {
    private Point start;
    private Point end;
    private static  int objectCount;

    //null
    Line(){
        this.start=new Point(0,0);
        this.end=new Point(1,1);
        Line.objectCount++;
    }

    //parameter
    Line(Point start,Point end){
        validateLine(start, end);
        this.start=start;
        this.end=end;
        Line.objectCount++;
    }

    //copy
    Line(Line obj){
        if(obj==null)throw new IllegalArgumentException("Cannot copy a null Line");
        this.start=obj.start;
        this.end=obj.end;
        Line.objectCount++;
    }

    //getter
    Point getStart(){
        return this.start;
    }
    Point getEnd(){
        return this.end;
    }
   
    //setter
    void setStartEnd(Point start,Point end){
        validateLine(start, end);
        this.start=start;
        this.end=end;
    }

    //object count
    public static int getObjectCount(){
        return Line.objectCount;
    }

    //lenght of line through method of Point(pointDistance)
    public double length(){
        return this.start.PointDistance(this.end);
    }

    //SLope of line using method of point(slope)
    public double slopeline(){
        return this.start.slope(this.end);
    }

    public boolean isHorizontal() {
        return start.getY() == end.getY();
    }

    public boolean isVertical() {
        return start.getX() == end.getX();
    }

    public boolean isParalell(Line obj){
        validateLine(obj.start,obj.end);
        return Math.abs(this.slopeline()-obj.slopeline())<1e-7;
    }

    public Point intersection(Line obj) {
        validateLine(obj.start, obj.end);
        //this line
        float a1 = this.end.getY() - this.start.getY();
        float b1 = this.start.getX() - this.end.getX();
        float c1 = a1 * this.start.getX() + b1 * this.start.getY();

        //intersecting line (obj)
        float a2 = obj.getEnd().getY() - obj.getStart().getY();
        float b2 = obj.getStart().getX() - obj.getEnd().getX();
        float c2 = a2 * obj.getStart().getX() + b2 * obj.getStart().getY();

        float determinant = a1 * b2 - a2 * b1;
        if (Math.abs(determinant) < 1e-7f) {
            throw new IllegalArgumentException("Lines are paralell or coincident");
        }

        //intersecting point coordinates
        float x = (b2 * c1 - b1 * c2) / determinant;
        float y = (a1 * c2 - a2 * c1) / determinant;

        return new Point(x, y);
    }

    //tan^-1|(m1-m2)/(1+m1*m2)|
    public double angleBetweenLines(Line obj){
        return Math.toDegrees(Math.atan(Math.abs((this.slopeline()-obj.slopeline())/(1+ (this.slopeline()*obj.slopeline())))));
    }

    //checks if line contains a point
    public boolean contains(Point obj) {
        if(obj==null)return false;
        return Math.abs((this.start.PointDistance(obj) + obj.PointDistance(this.end)) - this.length()) < 0.000001;
    }

    private static void validateLine(Point start,Point end){
        if(start.getX()==end.getX()&&start.getY()==end.getY()||start==null&&end==null){
            throw new IllegalArgumentException("Both points must be unique and not null.");
        }
    }

    //to string
    @Override
    public String toString(){
        return "start point: "+this.start+" end point :"+this.end;
    }

    //show
    void show(){
        System.out.println(this.toString());
    }
}
