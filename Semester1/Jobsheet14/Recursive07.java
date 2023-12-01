package Semester1.Jobsheet14;

public class Recursive07 {
    static int factorialRecursive(int n ){
        if (n==1)
            return 1;
        else
            return n*factorialRecusive(n-1);
    }
    static int factorialInterative(int n){
        int factorial = 1;
        for(int i=n; i>=1; i++){
            factorial = factorial*i;
        }
        return factorial;
    }
    public static void main(String[] args) {
        System.out.println("Hello world!!!");
        System.out.println(factorialRecursive(n:5));
        System.out.println(factorialInterative(n:5));
    }
}
