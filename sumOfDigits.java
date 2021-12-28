package company;

import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int remainder = 0;
        int original = num;
        while (num > 0) {
            remainder = num % 10;
            sum = sum + remainder;
            num = num / 10;
        }
        System.out.println("sum is " + sum);
    }

}
