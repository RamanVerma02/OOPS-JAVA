public class VariableArguments {
    static void show(int ...x){
        for(int a : x){
            System.out.println(a);
        }
    }

    // passing strings as varibale arguments
    static void showList(String ...s){
        for(int i=0; i<s.length; i++){
            System.out.println(i+1 +" "+ s[i]);
        }
    }
    // 2nd way
    static void showListwith(int start,String ...s){
        for(int i=0; i<s.length; i++){
            System.out.println(start+" "+s[i]);
            start++;
        }
    }


    public static void main(String[] args) {
        // show();
        // show(10);
        // show(10,20,30);
        // show(new int[]{20,40,60,80,30});

        // showList("raman","pandey","ravikant","rohit");
        showListwith(5,"raman","pandey","ravikant","rohit");
    }
}
