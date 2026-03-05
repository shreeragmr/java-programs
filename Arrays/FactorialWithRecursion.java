package Arrays;

import java.util.Scanner;

public class FactorialWithRecursion {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int fact = factorial(n);

        System.out.println("The factorial of the given number is "+fact);
    }

    private static int factorial(int n) {
        
        if(n == 0 || n ==1){
            return 1;
        }
        return n * factorial(n-1);
    }
}
