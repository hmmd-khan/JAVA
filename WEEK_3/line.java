public class line {
    private Point start;
    private Point end;
    private static  int objectCount;

    line(){
        this.start= new Point();
        this.end=new Point();
        this.objectCount++;
    }

    line(Point start,Point end){
        this.start=start;
        this.end=end;
        this.objectCount++;
    }

    line(line l){
        this.start=l.start;
        this.end=l.end;
        this.objectCount++;
    }

    Point getStart(){
        return this.start;
    }

    Point getEnd(){
        return this.end;
    }
    
    void setStartEnd(Point start,Point end){
        this.start=start;
        this.end=end;
    }

    int getObjectCount(){
        return this.objectCount;
    }
 
    @Override
    public String toString(){
        return "start point: "+this.start+" end point :"+this.end+" object count: "+line.objectCount;
    }

    void show(){
        System.out.println(this.toString());
    }
}
