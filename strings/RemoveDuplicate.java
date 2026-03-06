import java.util.HashSet;

public class RemoveDuplicate {
    // 2nd method Hashset se h

    static void removeDuplicateByHashSet(String str){
        str = str.toLowerCase();
        HashSet<Character> set = new HashSet<>();
        StringBuilder res = new StringBuilder();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(!set.contains(ch)){
                set.add(ch);
                res.append(ch);
            }
        }
        System.out.println(res);
    }

    // 1st Way
    static void removeDuplicateSimply(String str){
        String res = "";
        /*
          yha par humne isko phle hi lower case me kardiya taki R aur r ko alag
          alag na count kiya jaye
        */
        // str = str.toLowerCase();    // Method 1

        for (int i = 0; i < str.length(); i++) {
            // char ch = str.charAt(i);   // Method 1
            char ch = Character.toLowerCase(str.charAt(i));  // Method 2

            if (res.indexOf(ch) == -1) {
                res += ch;
            }
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        String str = "RamanrA";
        
        // removeDuplicateSimply(str);  
        removeDuplicateByHashSet(str);
    }
}
