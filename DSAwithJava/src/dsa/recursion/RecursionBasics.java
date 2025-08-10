package dsa.recursion;

public class RecursionBasics {

    public static void printName(int n, int cnt){
        if(n==cnt){
            return;
        }
        System.out.println("Learning basics.");
        cnt++;
        printName(n,cnt);
    }

    public static void print1ToN(int n,int num){
        if(num>n)
            return;
        System.out.println(num);
        print1ToN(n,num+1);
    }

    public static void printNTo1( int num){
        if(num==0)
            return;
        System.out.println(num);
        printNTo1(num-1);
    }

    public static void print1ToNByBacktracking(int n,int num){
        if(num < 1)
            return;
        print1ToNByBacktracking(n,num-1);
        System.out.println(num); //when the last function is called then that stack's(function call's) num value will get printed.
    }

    public static void printNTo1ByBacktracking(int n, int num){
        if (num>n)
            return;
        printNTo1ByBacktracking(n,num+1);
        System.out.println(num);
    }

    public static void main(String[] args) {
        int n = 5;
        printName(n,0);
        System.out.println("printing 1 to n: "); print1ToN(n,1);
        System.out.println("printing n to 1:");printNTo1(n);
        System.out.println("printing 1 to N by backtracking like :");print1ToNByBacktracking(n,n);
        System.out.println("printing N to 1 by backtracking like: ");printNTo1ByBacktracking(n,1);
    }
}

