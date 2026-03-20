public class EvenOdd {

    // Boolean-Based
    static boolean isEven(int num){
        return num % 2 == 0;
    }
    public static void main(String[] args) {
        int num = -17;

        if(isEven(num)){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}


/*
                                    String-based
public class EvenOdd {
    static String CheckEvenOdd(int num){
        if(num <= 0) return "Wrong Input";

        if(num % 2 == 0){
            return "Even";
        }else{
            return "Odd";
        }

    }
    public static void main(String[] args) {
        int num = -1;

        String output = CheckEvenOdd(num);
        System.out.println(output);
    }
}
                String-based Method 2

public class EvenOdd {

    static String isEven(int num){
        return (num % 2 == 0) ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        int num = 12;
        System.out.println(isEven(num));
    }
}
*/