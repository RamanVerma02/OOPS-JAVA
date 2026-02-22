public class Methods {

    // ALL IMPORTANAT STRING METHODS

    public static void main(String[] args) {
        String str = "Raman Verma";
        String str2 = "www.google.com";

        // System.out.println(str.charAt(7));
        // System.out.println(str.toLowerCase());
        // System.out.println(str.toUpperCase());
        // System.out.println(str.trim());
        // System.out.println(str.substring(2, 6));
        // System.out.println(str.replace("a", "p"));

        for(int i=0; i<str.length(); i++){
            // System.out.print(str.charAt(i)+" ");
        }
        // System.out.println(str2.startsWith("www"));
        // System.out.println(str2.endsWith("com"));
        // System.out.println(str2.indexOf('g')); --> for char index
        // System.out.println(str2.indexOf("g",5));
        // System.out.println(str2.lastIndexOf("c"));
        // System.out.println(str2.length());
        int len = str.length();
        // System.out.println(len);

        String str3 = "Java";
        String str4 = "java";
        String str5 = "Python";

        System.out.println(str3.equals(str4));  
        // return false
        System.out.println(str3.equalsIgnoreCase(str4));
        // return true 
        System.out.println(str3.equals(str5));
        // return false


        String str6 = "Raman";
        String str7 = "raman";

        System.out.println(str6.compareTo(str7));
        // return -32 means first string is small
        System.out.println(str7.compareTo(str6));
        // return +32 menas first string is bigger
        System.out.println(str7.compareTo(str7));
        // return 0 means both are equal

        int age = 22;
        String ageS = String.valueOf(age);
        // convert any datatype into String
        System.out.println(age);  // -->  22
        System.out.println(ageS); // --> "22"
        System.out.println(ageS.length());  // gives length

        System.out.println(((Object)age).getClass().getSimpleName());
        System.out.println(ageS.getClass().getSimpleName());  // to get data type


    }
}
