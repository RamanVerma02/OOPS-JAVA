public class TryCatch {

    public static void tryCatch(){
        try {
            int result = 10 / 0;
            System.out.println("Result is: " + result);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage()); // prints --> / by zero

            // Even you can prit your own message
            System.out.println("Can't divide by 0");
        }
    }

    // Multiple try Catch
    public static void multipleCatch() {
        try{
            int[] arr = new int[5];
            arr[5] = 10/0;
        } 
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
        // Or can Combine both Exception in One
        // catch(ArithmeticException | IndexOutOfBoundsException e){
        //     System.out.println(e.getMessage());
        // }
    }

    // 
    public static void main(String[] args) {
        // tryCatch();
        multipleCatch();
    }
}
