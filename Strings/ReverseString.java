public class ReverseString {
    // Using StringBuilder 
    static void reverseString(String str){
        StringBuilder sb = new StringBuilder(str);

        System.out.println(sb.reverse());
    }

    // Using Char Array
    static void reverseByCharArray(String str){
        char arr[] = str.toCharArray();
        String rev = "";

        for(int i=arr.length-1; i>=0; i--){
            rev += arr[i];
        }

        System.out.println(rev);
    }
    public static void main(String[] args) {
        String str = "Pool";
        String str1 = " Thing";
        String newStr = str.concat(str1);

    // Printing in forward order
    // Option 1
        for(int i=0; i<newStr.length(); i++){
            // System.out.print(newStr.charAt(i)+" ");
        }
    // Option 2
        for(int i=0; i<=newStr.length()-1; i++){
            // System.out.print(newStr.charAt(i)+" ");
        }

                // <-- 3 ways to reverse string -->

    // 1. Printing String in Reverse order char by char Using loop
        for(int i=newStr.length()-1; i>=0; i--){
            System.out.print(newStr.charAt(i)+" ");
        }

    // 2. Reversing String using StringBuilder
        reverseString(str);


    // 3. By converting to char aray
        reverseByCharArray(str);
    }


}
