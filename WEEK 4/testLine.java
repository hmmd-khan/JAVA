class testLine{
    public static void main(String args[]){
        try{
        //Objects with null, parameterized and copy constructor
        Line l1=new Line();
        Line l2=new Line(new Point(2,3),new Point (4,6));
        Line l3=new Line(l2);
        System.out.println("-----------------------------------");

        System.out.printf("Total no of objects Created from line: %s\n",Line.getObjectCount());
        System.out.println("-----------------------------------");

        System.out.printf("Checking if line is horizonal: %s \n",l1.isHorizontal());
        System.out.printf("Checking if line is vertical: %s \n",l1.isVertical());
        System.out.printf("Checking if line l2 is parallel to l3: %s \n",l2.isParalell(l3));
        System.out.println("-----------------------------------");

        System.out.printf("Checking if line l2 contains a point or not: %s\n",l2.contains(new Point(8,12)));
        System.out.printf("The angle Between l1 and l2 is: %.3f\n",l1.angleBetweenLines(l2));
        System.out.println("-----------------------------------");

        System.out.printf("line l1 before set method: %s\n",l1);
        l1.setStartEnd(new Point(3,4),new Point( 12,4));
        System.out.printf("line l1 after set method: %s\n",l1);
        System.out.println("-----------------------------------");

        System.out.printf("The intersecting Point of l1 and l2 is: %s\n",l1.intersection(l3));
        }
        catch(IllegalArgumentException e){
            System.out.println("Rejected: "+ e.getMessage());
        }
    }
}
