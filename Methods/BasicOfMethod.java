public class BasicOfMethod{

    int max(int x, int y){
        if(x>y)
            return x;
        else
            return y;
    }
    
    public static void main(String[] args){
        // calling method by class object if you have not made method "static"
        BasicOfMethod sb = new BasicOfMethod();

        int a=10, b=15, c;
        c = sb.max(a,b);

        System.out.println(c);
    }
}