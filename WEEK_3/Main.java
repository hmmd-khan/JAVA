public class Main {
    public static void main(String []args){
        try{
        //POINT CLASS TESTING
        //Objects with null,parameterized and copy constructor of Point
        Point p1=new Point();
        Point p2=new Point(2,3);
        Point p3=new Point(4,6);
        System.out.println("----------------------------------");

        System.out.printf("Total no of Point objects created: %d\n",Point.getObjectCount());
        System.out.println("----------------------------------");

        //subtracting point p2 from p3 which results in a vector
        //System.out.printf("P3-P2 = Vector: %s\n",p3.subtract(p2));
        System.out.println("----------------------------------");

        //Distance Between Point p2 and p3
        System.out.printf("Distance between p2 and p3: %.3f\n",p2.PointDistance(p3));
        System.out.println("----------------------------------");

        //Translating the point p1
        System.out.printf("P1 before translation: %s\n",p1);
        p1.translatePoint(2, 5);
        System.out.printf("P1 after translation: %s\n",p1);
        System.out.println("----------------------------------");

        System.out.printf("Midpoint of p2 and p3: %s\n",p2.midPoint(p3));
        System.out.println("----------------------------------");

        //Vector Class Testing
        //Object with null, parameterized and copy contructor of vector
        Vector v1=new Vector();
        Vector v2=new Vector(3,4);
        Vector v3=new Vector(6,9);
        Vector v4=new Vector(v2);
        System.out.println("----------------------------------");

        System.out.printf("Total number of Vectors created: %d \n",Vector.getObjectCount());
        System.out.println("----------------------------------");

        System.out.printf("Dot product of v2 and v3 results a double value: %.3f\n",v2.dotProduct(v3));
        System.out.println("----------------------------------");

        System.out.printf("Cross product of v2 and v3 results a Vector: %s \n",v2.crossProduct(v3));
        System.out.println("----------------------------------");

        System.out.printf("Vector Projection of v2 on v3: %s\n",v2.projection(v3));
        System.out.println("----------------------------------");

        System.out.printf("Checking is vector orthogonal or not(v2 and v4):%b \n",v2.isPerpendicular(v4));
        System.out.println("----------------------------------");

        System.out.printf("Direction of Vector v3 in radian: %.3f\n",v3.direction());
        System.out.println("----------------------------------");

        //Finding slope of points that have same value of x
        System.out.println("Slope of (2,3) and (2,5)(same X)is: ");
        System.out.println(p1.slope(p2));
        }
        catch(IllegalArgumentException exception) {
        System.out.println("Rejected: " + exception.getMessage());
        }
    }
}




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




