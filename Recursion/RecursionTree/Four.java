package Recursion.RecursionTree;

public class Four {
    public static int fn(int x, int y){
        if(x == 0)
            return y;
        else
            return fn(x-1, x+y);
    }
    public static void main(String[] args) {
        int res = fn(3, 4);
        System.out.println(res);
    }
}

// Output : 10
