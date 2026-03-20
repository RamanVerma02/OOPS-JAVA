public class Fabonacci {
    static int fab(int n){
        // Base cases: 1st term = 0, 2nd term = 1
        if(n==1) return 0;
        if(n==2) return 1;

        // Recursive formula
        return fab(n - 1)+ fab(n - 2);
    }
    public static void main(String[] args){
        int num = 2;
        int res = fab(num);
        System.out.println("Fabonnaci number of "+num+" is => "+res);
    }
}


// 0 1 1 2 3 5 8 13 21 34 55
// 1 2 3 4 5 6 7  8  9 10 11


// ⚠ Note (Important)

// Recursive Fibonacci large term पर slow हो जाता है.
//  ex--> fib(50) → बहुत time लेगा
// Better approach: Memoization or Iteration.

// USE For loop in method 