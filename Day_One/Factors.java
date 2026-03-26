public class Factors {
// Loop runs half of num times 
// Example --> for 24 it runs 11 times (2 3 4 5 6 7 8 9 10 11 12)
// Time Complexity O(n)

    static void simpleWay(int num){
        int count =0;
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
            count++;
        }
        System.out.println("--> "+count);
    }


// More Efficient Way because till i*i <= num loop runs only root of n times 
// Example --> for 24 it runs aprox 4.8 times- total iteration 3 (2,3,4) 
// ~3.6× kam loop
// Time Complexity O(√n)

    static void efficientWay(int num){
        int count =0;
        for (int i = 2; i*i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
            if(i != num/i){
                System.out.print(num/i+" ");
            }
            count++;
        }
        System.out.println("--> "+count);
    }
    public static void main(String[] args) {
        int num = 24;
        simpleWay(num);
        efficientWay(num);
        
    }
}
