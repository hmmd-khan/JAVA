public class RationalNumber {
    private int numerator;
    private int denominator;
    private static int objectCount=0;

    //null
    RationalNumber(){
        this.numerator=1;
        this.denominator=1;
        RationalNumber.objectCount++;
        reduce();
    }

    //parameter
    RationalNumber(int num,int deno){
        if(deno==0)
            throw new IllegalArgumentException("Denominator must not be zero.");
        if(deno<0){
            num*=-1;
            deno*=-1;
        }
        this.numerator=num;
        this.denominator=deno;
        RationalNumber.objectCount++;
        reduce();
    }

    //copy
    RationalNumber(RationalNumber obj){
        if(obj==null)throw new IllegalArgumentException("Null object cannot be copied.");
        this.numerator=obj.numerator;
        this.denominator=obj.denominator;
        RationalNumber.objectCount++;
        reduce();
    }

    //getter
    public int getNumerator(){
        return this.numerator;
    }

    public int getDenominator(){
        return this.denominator;
    }

    //reciprocal
    public RationalNumber reciprocal (){
        if(this.numerator==0) throw new IllegalArgumentException("Cannot find reciprocal because numerator is zero.");
      return new RationalNumber (this.denominator, this.numerator);
    }

    //add two Rtional Numbers
    public RationalNumber add (RationalNumber obj){
      int commonDenominator = this.denominator * obj.denominator;
      int sum = (this.numerator *obj.denominator)+ (obj.numerator * this.denominator);
      return new RationalNumber (sum, commonDenominator);
     }

    //subract Rational Number
    public RationalNumber subtract (RationalNumber obj){
      int commonDenominator = this.denominator * obj.denominator;
      int difference = (this.numerator * obj.denominator)- (obj.numerator * this.denominator);
      return new RationalNumber (difference, commonDenominator);
    }

    public RationalNumber multiply (RationalNumber obj){
      return new RationalNumber (numerator * obj.numerator, denominator * obj.denominator);
    }

    //divide
    public RationalNumber divide (RationalNumber obj){
        if(obj.numerator==0)throw new IllegalArgumentException("Cannot find divide because other Object's numerator is zero.");
      return this.multiply(obj.reciprocal());
    }

    //a=bq+r => int q=a/b;int r=a%b;=>replace (a,b) with (b,r) => apply theorm :gcd (a,b)=gcd(b,r) iteratively e.g 48=(18*2)+12 => 19=12(1)+6 => 12=6(2)+0 => gcd(48,18)=gcd(18,12)=gcd(12,6)=gcd(6,0)
    //a=bq+r=>gcd(a,b)=gcd(b,r)
    private static int gcd(int a,int b){
        while (b != 0) {
        int r = a % b; 
        a = b; 
        b = r; 
       }
        return Math.abs(a);
    }

    private void reduce(){
        int common=gcd(this.numerator, this.denominator);
        this.numerator=numerator/common;
        this.denominator=denominator/common;
    }

    //object count
    public static int getObjectCount(){
        return RationalNumber.objectCount;
    }
 
    //to string
    public String toString(){
        if (this.numerator == 0)  
            return "Rational Number: 0";
        else if (this.denominator == 1) 
            return "Rational Number: "+this.numerator;
        else 
            return "Rational Number: "+this.numerator + "/" + this.denominator;
    }

    //show
    void show(){
        System.out.println(this.toString());
    }

    public boolean equals(RationalNumber obj) {
        //self check
        if (this == obj) {
            return true;
        }

        //null check
        if (obj == null ) {
            return false;
        }

        //check is the obj belongs to Rational number or not
        if(!(obj instanceof RationalNumber)){
            return false;
        }

        //Explicit type casting
        RationalNumber other = (RationalNumber) obj;
        //equality check
        return this.numerator==other.numerator && this.denominator==other.denominator;
    }
}
