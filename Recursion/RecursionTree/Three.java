package Recursion.RecursionTree;

public class Three {
    public static void fn(int n) {
        if (n == 0)
            return;
        fn(n / 2);
        System.out.print(n % 2 + " ");

    }

    public static void main(String[] args) {
        fn(25);
    }
}

// OUTPUT : 1 1 0 0 1 