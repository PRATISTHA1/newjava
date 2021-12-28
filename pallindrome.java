package company;

import java.util.Scanner;

public class pallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter original number");
        int num = sc.nextInt();
        int original = num;
        int reverse = 0;
        int remainder;
        while (original != 0) {
            remainder = original % 10;
            original = original / 10;
            reverse = reverse * 10 + remainder;
        }
        if (num == reverse) {
            System.out.println("pallindrome");
        } else {
            System.out.println(" not pallindrome");
        }
    }
}
