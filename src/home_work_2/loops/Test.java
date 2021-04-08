package home_work_2.loops;

public class Test {
    public static void main(String[] args) {
        //int[] container = {1, -2, 10, 4, 5, -6, 11, 9};
        int n = 158;
            int    sum;

        for(sum=0 ;n!=0 ;n/=10)
        {
            sum+=n%10;
        }
        System.out.println("Sum of digits of a number is "+sum);
    }
       }




