import java.util.Scanner;

public class GP {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first term: ");
        int a = sc.nextInt();
        System.out.println("Enter common ratio: ");
        int r = sc.nextInt();
        System.out.println("Enter series number: ");
        int n = sc.nextInt();

        int term = a;
        for (int i = 1; i <= n; i++) {
            System.out.print(term + " ");
            term = term * r;
        }
    }
}
