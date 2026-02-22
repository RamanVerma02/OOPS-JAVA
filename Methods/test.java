public class test {
    public static void main(String[] args) {
        // for(String x : args){
        //     System.out.println(x);
        // }

        double s =0;
        for(String x : args){
            if(x.matches("[0-9\\.]+"))  // regular expression
                s+= Double.parseDouble(x);
        }
        System.out.println("total is: "+s);
    }
}

// input --> java test raman verma hello ji
/*
output --> 
raman
verma
hello
ji

 */