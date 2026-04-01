import java.util.Scanner;

public class Prime {

    static boolean checkPrime(int num){
        if(num <= 1) return false;

        for(int i=2; i*i<=num; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();

        // System.out.println(checkPrime(number));
        System.out.println(number+" is "+ (checkPrime(number) ? "Prime" : "Not Prime"));

    }
}


/*
                        FINAL PROFESSIONAL VERSION

import java.util.Scanner;

public class Prime {

    static boolean checkPrime(int n) {

        if (n <= 1) return false;       // 0 and 1 are not prime
        if (n == 2) return true;        // 2 is the only even prime
        if (n % 2 == 0) return false;   // eliminate all even numbers

        // check only odd divisors
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        boolean isPrime = checkPrime(number);

        System.out.println(number + " is " + (isPrime ? "Prime" : "Not Prime"));

        sc.close();
    }
}



✔Professional naming
✔ Handles edge cases cleanly
✔ Fastest method without using Math.sqrt()
✔ Even numbers skipped
✔ Only odd divisors checked → 50% faster
✔ Clean code structure
✔ Resource closing (Scanner)
✔ Easy to read, easy to maintain

*/