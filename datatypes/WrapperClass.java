public class WrapperClass {

    public static void main(String[] args) {
        int num = 7;
        // Integer num1 = new Integer(num);   // Boxing

        Integer num1 = num;   // Auto-Boxing

        int num2 = num1;   // Auto-UnBoxing

        System.out.println(num1);

        // String  -->  int
        String age = "23";
        Integer chg = Integer.parseInt(age);
        System.out.println(chg*2);
        System.out.println(chg.getClass().getSimpleName());

        // int  -->  string
        String nop = String.valueOf(num);
        System.out.println(nop);
        System.out.println(nop.getClass().getSimpleName());
    }
}


/*
“Wrapper classes convert primitive types into objects.
They are needed for collections, generics, and utility methods.
Java supports autoboxing and unboxing automatically.”


Wrapper vs Primitive (1-liner difference)

Primitive → fast, memory less
Wrapper → object, flexible, collections me required

📌 Difference:

parseInt() → primitive
valueOf() → wrapper object

🧠 20-second interview summary

“Wrapper classes provide utility methods like parseInt, valueOf, compareTo, and constants.
They help convert data types and work with collections.”

🔥 TOP MOST-USED WRAPPER METHODS (Java)
1️⃣ parseXxx() – MOST IMPORTANT

👉 String → primitive

int a = Integer.parseInt("123");
double d = Double.parseDouble("3.14");
boolean b = Boolean.parseBoolean("true");


📌 Use case:

Scanner / form input

File data

API response

2️⃣ valueOf() – String → Wrapper Object
Integer x = Integer.valueOf("100");
Double y = Double.valueOf("2.5");


📌 Difference:

parseInt() → primitive

valueOf() → wrapper object

3️⃣ toString() – Any value → String
Integer a = 10;
String s = a.toString();


or

String s = String.valueOf(10);


📌 Project + logging me kaam aata hai

4️⃣ compareTo() – Comparison
Integer a = 10;
Integer b = 20;

a.compareTo(b);   // -1


📌 Sorting, ranking, logic building

5️⃣ equals() – Value compare (NOT ==)
Integer a = 100;
Integer b = 100;

System.out.println(a.equals(b));  // true


❌ Avoid:

a == b;   // risky

6️⃣ max() / min()
int max = Integer.max(10, 20);
int min = Integer.min(10, 20);


📌 Clean code, interviews love this

7️⃣ isDigit() – Character Wrapper
char c = '5';
System.out.println(Character.isDigit(c));  // true


Other useful:

Character.isLetter(c);
Character.isUpperCase(c);

8️⃣ Constants (underrated 🔥)
Integer.MAX_VALUE;
Integer.MIN_VALUE;


📌 DSA problems me super useful
*/