public class TryCatchFinally {
    public static void main(String[] args) {
        int n1 = 100;
        int n2 = 10;
        System.out.println("Before exception");

        try {

            int r = (n1 / n2);
            System.out.println("Division= " + r);

        } catch (ArithmeticException ae) {
            // System.out.println(ae.getMessage());
            // System.out.println("Please enter number 2 greater than 0");
            ae.printStackTrace();

        } finally {
            System.out.println("this is finally block");
        }
        System.out.println("After Exception");
    }
}
