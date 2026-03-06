package Recursion;
// Calculate m*n by Recurtion 

public class RecOne {
    public static int mul(int x,int y){
        if(x==0 || y==0) return 0;

        return x+mul(x,y-1);
    }
    public static void main(String[] args) {
        int result = mul(2,3);
        System.out.println(result);
    }
}

// (2*3) ==> 2+2+2   ==> 2+(2*2)
// (2*2) ==> 2+2     ==> 2+(2*1)
// (2*1) ==> 2       ==> 2+(2*0)
// (2*0) ==> 0       ==> 0