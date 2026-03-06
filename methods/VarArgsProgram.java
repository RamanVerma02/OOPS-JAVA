public class VarArgsProgram {
    static void sumUsingVarargs(int ...n){
        int sum = 0;
        for(int x : n){
            sum+=x;
        }
        System.out.println("sum is: "+sum);
    }

    static void maximumUsingVarargs(int ...n){
        int a = 0;
        for(int x : n){
            if(x>a)
                a=x;
        }
        System.out.println("maximum is: "+a);
    }

    static void allInOne(int ...n){
        int sum = 0;
        int a=0;
        for(int x : n){
            if(x>a)
                a=x;
            sum+=x;
        }
        System.out.println("sum is: "+sum);
        System.out.println("maximum is: "+a);

    }
    
    public static void main(String[] args) {
        // sumUsingVarargs(10,20,30,40,50);
        // maximumUsingVarargs(10,20,30,40,50);
        allInOne(10,20,30,40,50);
    }
}
