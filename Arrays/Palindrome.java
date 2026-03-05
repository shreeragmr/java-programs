package Arrays;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        int rev = 0;
        int original = num;

        while(num != 0){
            int temp = num%10;
            rev = rev*10 + temp;
            num = num/10;
        }

        if(rev == original)
            System.out.println("The given number is a palindorme");
        else
            System.out.println("The given number is not a palindrome");
    }
}
