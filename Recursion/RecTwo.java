package Recursion;
// Calculate m^n by Recurtion 

public class RecTwo {
    public static int pow(int x,int y){
        if(y==0) return 1;

        return x*pow(x,y-1);
    }
    public static void main(String[] args) {
        int result = pow(2,3);
        System.out.println(result);
    }
}

// (2^3) ==> 2*2*2   ==> 2*(2^2)
// (2^2) ==> 2*2     ==> 2*(2^1)
// (2^1) ==> 2       ==> 2*(2^0)
// (2^0) ==> 0       ==> 1

/*      WAY TO RUN PACKAGE FILE

Java CORE--> javac Recursion/RecTwo.java
Java CORE--> java Recursion.RecTwo

*/