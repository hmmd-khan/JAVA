public class Main {
    public static void main(String []args){

    //WITH NULL
    Point p1=new Point();

    //WITH PARAMETER
    Point p2=new Point(5,6);

    //WITH COPY
    Point p3=new Point(p1);

    //SUBTRACT POINT
    Point p4=p2.subtract(p1);

    //MIDPOINT
    Point midPoint=p1.midPoint(p2);

    System.out.println(midPoint);

    //POINT ADDITION
    Point p5=p2.add(p1);

    System.out.println(p1.slope(p2));

    p4.print();

    System.out.printf("%.2f",p2.distancePoint(p1));

    }
}




