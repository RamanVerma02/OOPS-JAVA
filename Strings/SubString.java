    import java.util.HashSet;

    public class SubString{
        // Substring Using Loops 
        public static void withLoops(String s){
            int count=0;
            for(int i=0; i<s.length(); i++){
                for(int j=i+1; j<=s.length(); j++){
                    System.out.print(s.substring(i,j)+" ");
                    count++;
                }
            }
            System.out.println(count);
        }

        // UNIQUE Substring Using Hashset
        public static void withHashSet(String s){
            HashSet<String> set = new HashSet<>();

            for(int i=0; i<s.length(); i++){
                for(int j=i+1; j<=s.length(); j++){
                    set.add(s.substring(i,j));
                }
            }
            // Print Unique substrings
            for(String str : set){
                System.out.println(str+" ");
            }
            // Total count
            System.out.println("Total Unique substring: "+set.size());
        }

        public static void main(String[] args) {
            String s = "raman";
            // withLoops(s);
            withHashSet(s);
        }
    }
    /*
    💡 Idea

    Substrings nikaalo (nested loops)
    HashSet use karo → duplicate automatically remove ho jaate hain

    ⏱ Time & Space Complexity

    Time: O(n²)
    Space: O(n²) (HashSet)

    🔥 Bonus Question (Interviewer pooch sakta hai)

    Q: Why not ArrayList?
    A: “ArrayList allows duplicates, but HashSet ensures uniqueness automatically.”
    */