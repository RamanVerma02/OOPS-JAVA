package Recursion;
// WAP to find nth term in fabonacci series

public class nthTermFab {

    public static int fab(int n) {
        if (n == 0 || n == 1)
            return n;

        return fab(n - 1) + fab(n - 2);
    }

    public static int fabMethod2(int n) {
        if (n <= 1)
            return n;

        int a = 0;
        int b = 1;

        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println(fab(6));
        System.out.println(fabMethod2(7));
    }

}
