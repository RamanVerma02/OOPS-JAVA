public class Palindrom {
    public static void main(String[] args) {
        String str = "moon";
        String rev = "";

        for(int i=str.length()-1; i>=0; i--){
            rev += str.charAt(i);
        }

        if(rev.equals(str)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }

    }
}
