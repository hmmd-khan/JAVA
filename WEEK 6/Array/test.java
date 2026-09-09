// public class test{
//     static int j=40;
//     public static void main(String[] argv) {
//     int i;
//     int j;
//     outer:
//     for(i=2;i<4;i++){
//         inner:
//         for(j=1;j<3;j++){
//             if(i==2)
//                 continue outer;
//         System.out.println(i+" "+j);
//         }
//     }
// }
// }

public class test{
    public static void main(String args[]){
    try{
        // Integer i=200;
        // Integer j=200;
        // int a=4;
        // int b=4;
        // System.out.println(i.equals(j));
        // System.out.println(i==j);
        // System.out.println(a==b);

        Array a1=new Array();
        Point p1=new Point(1,2);
        Point p2=new Point(5,6);
        Point p3=new Point();
        Point p4=new Point(p2);
        int [] i=new int[]{7,8,9,1};
        Point [] p=new Point[]{p1,p2,p3,p4};
        
        Array a2=new Array(2,i,p);
        Array a3=new Array(a2);
        Array a4=(Array) a1.clone();
        Array a5=(Array) a2.clone();

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);

        System.out.println(a2.equals(a3));
        System.out.println(a1.equals(a4));
        System.out.println(a5.equals(a2));

    
    }
        catch(IllegalArgumentException e){
            System.out.println("Rejected: "+ e.getMessage());
        }
        catch(CloneNotSupportedException e){
            System.out.println("clone unsupported: "+ e.getMessage());
        }
    }
}