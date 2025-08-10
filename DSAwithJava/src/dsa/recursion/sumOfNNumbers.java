package dsa.recursion;

public class sumOfNNumbers {

    public static void summationWithParameterizedWay(int n,int sum){
        if(n<0){
            System.out.println(sum);
            return;
        }
        summationWithParameterizedWay(n-1,sum+n);
    }

    public static int summationWithFunctionalWay(int n){
        if(n==0){
            return 0;
        }
        return n + summationWithFunctionalWay(n-1);
    }
    
    public static void main(String[] args) {
        int n = 5;
        System.out.println("paramerterized way to print the sum: ");
        summationWithParameterizedWay(5,0);

        System.out.println("functional way to print the sum: ");
        System.out.println(summationWithFunctionalWay(n));
    }
}
