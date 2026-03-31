import java.util.*;

public class PositiveNegative {
    static void checkNumber(int number){
        if(number == 0){
            System.out.println("Invaild Input");
        }if(number > 0){
            System.out.println("Positive Number");
        }else if(number < 0){
            System.out.println("Negative Number");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number: ");
        int number = sc.nextInt();

        checkNumber(number);
    }
}



                    // ***** way 2nd *****
/*
import java.util.*;

public class PositiveNegative {

    static int checkNumber(int number) {
        if (number == 0) {
            return 0;   // invalid or zero
        }
        if (number > 0) {
            return 1;   // positive
        } else {
            return -1;  // negative
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = sc.nextInt();

        int result = checkNumber(number); // method returns value

        if (result == 1) {
            System.out.println("Positive Number");
        } else if (result == -1) {
            System.out.println("Negative Number");
        } else {
            System.out.println("Invalid Input");
        }
    }
}



                    // ***** way 3rd *****
BEST & PROFESSIONAL WAY (String return type — most readable)

import java.util.*;

public class PositiveNegative {

    // Clean & professional method
    static String checkNumber(int number) {
        if (number > 0) return "Positive Number";
        if (number < 0) return "Negative Number";
        return "Invalid Input (Zero)";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = sc.nextInt();

        // Best practice: store return value & print
        System.out.println(checkNumber(number));
    }
}

    

*/