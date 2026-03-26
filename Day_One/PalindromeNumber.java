import java.util.*;

public class PalindromeNumber {
    
    static boolean isPalindrome(int number){
        int original = number;
        int rev=0;

        while(number != 0){
            int digit = number % 10;
            rev = rev * 10 + digit;
            number =  number / 10;
        }
        return rev == original;
    }
    

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number: ");
        int number = sc.nextInt();

        if(isPalindrome(number)){
            System.out.println(number+" is a Palindrome");
        }else{
            System.out.println(number+" is NOT a Palindrome");
        }

    }
}

/*
1. Using String Reverse

import java.util.Scanner;

public class PalindromeStringMethod {

    static boolean isPalindrome(int number) {
        String str = String.valueOf(number);
        String rev = new StringBuilder(str).reverse().toString();
        return str.equals(rev);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int number = sc.nextInt();

        System.out.println(isPalindrome(number));
    }
}


2. Using String.charAt() (Manual Reverse)

public class PalindromeCharAt {

    static boolean isPalindrome(int number) {
        String s = String.valueOf(number);
        int left = 0, right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

3. Using Array of Digits

public class PalindromeArray {

    static boolean isPalindrome(int number) {
        char[] arr = String.valueOf(number).toCharArray();
        int left = 0, right = arr.length - 1;

        while (left < right) {
            if (arr[left] != arr[right]) return false;
            left++;
            right--;
        }
        return true;
    }
}

*/