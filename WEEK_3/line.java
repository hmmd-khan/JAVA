public class line {
    private Point start;
    private Point end;

    line(){
        this.start= new Point();
        this.end=new Point();
    }

    line(Point start,Point end){
        this.start=start;
        this.end=end;
    }

    line(line l){
        this.start=l.start;
        this.end=l.end;
    }

    
}
