package Recursion.RecursionTree;

public class Two {
    public static void fn(int n) {
        if (n > 0) {
            fn(n - 1);
            System.out.print(n+" ");
            fn(n - 1);
        }
    }
    public static void main(String[] args) {
        fn(3);
    }
}

// OUTPUT : 1 2 1 3 1 2 1 