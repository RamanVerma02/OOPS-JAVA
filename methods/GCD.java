public class GCD {
    static int gcd(int x, int y){
        while(y != 0){
            int temp = y;
            y = x % y ;
            x = temp ;
        }
        return x;
    }

    static int greatorFactor(int n){

        for(int i=n/2; i>1; i--){
            if(n % i == 0){
                return i;
            }
        }
        return 1;
    }

    static int gcd2ndmethod(int a, int b){
        while(a!=b){
            if(a>b) a=a-b;
            else b=b-a;
        }
        return a;
    }

    public static void main(String[] args) {
        int num = 91;
        System.out.println(greatorFactor(num));

        // 1st way
        int res = gcd(56, 35);
        System.out.println(res);

        // 2nd way
        System.out.println(gcd2ndmethod(35, 56));
    }
}
