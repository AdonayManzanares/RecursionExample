//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static int factorial(int n){
        if(n == 0)
        {
            return 1;
        }
        else
        {
            return n * factorial(n - 1);

        }
    }

    public static int fib(int f){
        if(f == 1 || f == 2)
        {
            return 1;
        }
        else
        {
            return fib(f - 2) + fib(f - 1);
        }
    }

    public static void main(String[] args) {
        int result = factorial(10);
        int Fibonacci = fib(7);
        System.out.println("The Factorial fo 10 is: " + result);
        System.out.println("The Fibonacci Sequence of 7 is :" + Fibonacci);
    }
}