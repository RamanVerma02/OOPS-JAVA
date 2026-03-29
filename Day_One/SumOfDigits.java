import java.util.*;

public class SumOfDigits {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int number = sc.nextInt();

        System.out.println("Sum of digits are: ");
        int sum = 0;
        while(number != 0){
            int digit = number%10;
            sum += digit;
            number = number/10;
        }

        System.out.println("Digit sum = "+sum);
    }
}






/*
            *** 
    import java.util.*;

public class SumOfDigits {

    public static int sumDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive number: ");

        if (!sc.hasNextInt()) {
            System.out.println("Invalid input! Please enter a valid integer.");
            return;
        }

        int number = sc.nextInt();
        if (number < 0) {
            System.out.println("Negative numbers are not allowed.");
            return;
        }

        int result = sumDigits(number);

        System.out.println("Sum of digits = " + result);
    }
}


2. Intermediate Level (Improved Version)

इसमें हम:

✔ Variable names बेहतर करेंगे
✔ Input validation जोड़ेंगे
✔ Method का use करेंगे

Expert-like improvements:
Input validation
Logic को method में separate करना
Meaningful names
Clean output


⭐ 4. Aur Expert Banne ke Tarike (IMPORTANT)
✔ 1. Clean Code Principles सीखो

Meaningful variable names

Logic को छोटे-छोटे methods में तोड़ना

Avoid duplication

Simple logic लिखना

✔ 2. Consistent Formatting

indentation

spacing

line breaks
ये professional look देता है।

✔ 3. Error Handling सीखो

Professional code हर गलत input handle करता है।

✔ 4. Test Case सोचना सीखो

0

negative numbers

very large numbers

wrong input

✔ 5. OOP & Design Patterns धीरे-धीरे सीखना

यही चीज expert बनाती है।




*/