public class StringEquals {
    public static void main(String[] args) {
    // Case 1 --> 
        String str1 = "Pool";
        String str2 = new String("Pool");

        System.out.println(str1.equals(str2));   // True
        System.out.println(str1==str2);          // False
    
    // Case 2 -->
        String str3 = "Pool";
        String str4 = "Pool";

        System.out.println(str3.equals(str4));  // True
        System.out.println(str3==str4);         // True
    
    // Case 3 -->
        String str5 = "Pool";
        String str6 = "pool";

        System.out.println(str5.equals(str6));  // False
        System.out.println(str5==str6);         // False
    }
}
