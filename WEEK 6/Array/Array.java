import java.util.Arrays;

public class Array implements Cloneable,Comparable{
    private int value;
    private int[] anArray;
    private Point[] anPoint;
    Array(){
        this.value=0;
        this.anArray=new int[]{1,2,3,4};
        this.anPoint=new Point[]{new Point(2,3),new Point(4,5),new Point(),new Point()};
    }
    Array(int value,int[] anArray,Point[] anPoint){
        this.value=value;
        this.anArray=anArray;
        this.anPoint=anPoint;
    }

    void inscrement(){
        this.value+=1;
    }

    //not 100% deep (points are stored by reference)
    Array(Array obj){
        this.value=obj.value;
        this.anArray=obj.anArray.clone();
        this.anPoint=obj.anPoint.clone();
    }
    public Array clone() throws CloneNotSupportedException{
        Array cloned=(Array) super.clone();

        cloned.anArray=this.anArray.clone();

        cloned.anPoint=new Point[this.anPoint.length];

        for(int i=0;i<this.anPoint.length;i++){

            if(this.anPoint[i]!=null)

            cloned.anPoint[i]=new Point(this.anPoint[i]);

        }
        return cloned;
    }

    @Override
    public boolean equals(Object obj) {
    // 1. Same memory address check
    if (this == obj) return true;
    
    // 2. Null and class type check
    if (obj == null || this.getClass() != obj.getClass()) return false;
    
    Array other = (Array) obj;
    
    // 3. Compare the primitive 'value'
    if (this.value != other.value) return false;
    
    // 4. Compare the contents of the int[] array
    // Arrays.equals() loops through and checks every single integer
    if (!Arrays.equals(this.anArray, other.anArray)) return false;
    
    // 5. Compare the contents of the Point[] array
    // This relies heavily on the .equals() method we just wrote for the Point class!
    return Arrays.equals(this.anPoint, other.anPoint);
    }

    @Override
    public int hashCode() {
    // Start with a standard hash of your primitive value
    int result = Integer.hashCode(this.value);
    
    // Multiply by a prime number (31) and add the array's hash code
    // This is the industry-standard math for combining hash codes
    result = 31 * result + Arrays.hashCode(this.anArray);
    result = 31 * result + Arrays.hashCode(this.anPoint);
    
    return result;
    }

    @Override
    public int compareTo(Object other) {
        Array obj=(Array) other;
    // Primary Sort: Compare the primitive 'value'
    int valueCompare = Integer.compare(this.value, obj.value);
    
    if (valueCompare != 0) {
        return valueCompare;
    }
    
    // Tie-breaker 1: If values are equal, compare the length of the int[] arrays
    int anArrayLengthCompare = Integer.compare(this.anArray.length, obj.anArray.length);
    if (anArrayLengthCompare != 0) {
        return anArrayLengthCompare;
    }
    
    // Tie-breaker 2: If int[] lengths are equal, compare the length of Point[] arrays
    return Integer.compare(this.anPoint.length, obj.anPoint.length);
    }

    public String toString(){
        return "value\t"+this.value+"anArray\t"+Arrays.toString(this.anArray)+"anPoint\t"+Arrays.toString(anPoint);
    }
}