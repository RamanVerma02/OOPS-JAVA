public class Swaped {

    static void swap(int num1,int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;
        
        System.out.println(num1 + " " + num2);
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 20 ;
        swap(a,b);
        System.out.println(a+" "+b);
    }

// 2nd WAY
    static void swap(int[] nums){
        int temp = nums[0];
        nums[0] = nums[1];
        nums[1] = temp;
        
        System.out.println(nums[0] + " " + nums[1]);
    }
    // public static void main(String[] args) {
    //     int[] arr = {10,20};
    //     swap(arr);
        
    //     System.out.println(arr[0]+" "+arr[1]);
    // }
}

/*
                            || NOTES ||

-->> so here what we see is ....  primitive data types are pass by value which means
original value's copy is passed , but if you change them they will not change original 
value - (EXAMPLE --> we can see that in 1st way)


-->> on other hand << 2nd way >>
if you want to swap values you need to pass by reference which means you have to pass
the address of that variable so that if you make changes that will reflect on original
value

EXAMPLE --> we make the array(THEY ARE REFERENCE TYPE) coz it passing value of refrence variable (address)


*/