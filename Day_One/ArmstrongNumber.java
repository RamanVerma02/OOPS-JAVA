public class ArmstrongNumber{
    static int digitsNumber(int n){
        int count = 0;
        while(n>0){
            n = n/10;
            count++;
        }
        return count;
    }

    static boolean isArmstrong(int n){
        int digits = digitsNumber(n);
        int original = n;
        int sum=0;
        while(n>0){
            int digit = n%10;

            int total = 1;
            for(int i=1; i<=digits; i++){
                total = total*digit;
            }

            sum += total;
            n = n/10;
        }
        if(sum == original) return true;
        else return false;
    }
    public static void main(String args[]){
        int n = 153;
        // System.out.println(isArmstrong(n));
        boolean res  = isArmstrong(n);
        System.out.println(res);
    }
}


/*          
                        || Using inbuit Methods ||

import java.util.*;

public class ArmstrongNumber{
    static boolean isArmstrong(int num){
        int orignal = num;
        int digits = String.valueOf(num).length();
        int sum = 0; 

        while(num != 0){
            int digit = num % 10;
            sum += Math.pow(digit,digits);
            num = num / 10;
        }
        if(sum == orignal){
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        boolean res = isArmstrong(num);
        System.out.println(res);

    }
}


*/