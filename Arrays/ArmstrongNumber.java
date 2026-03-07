package Arrays;

public class ArmstrongNumber {
    public static void main(String[] args) {
        
        int num = 371;
        int original = num;
        int sum = 0;
        int digits = 0;

        int temp = num;
        while (temp != 0) {
            digits++;
            temp /= 10;
        }

        temp = num;

        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        if (sum == original)
            System.out.println(original + " is an Armstrong number");
        else
            System.out.println(original + " is not an Armstrong number");
    
    }
}
