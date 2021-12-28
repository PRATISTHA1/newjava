package company;

import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int original = num;
        int duplicate = 0, remainder;
        while (num > 0) {
            remainder = num % 10;
            duplicate = duplicate + (remainder * remainder * remainder);
            num = num / 10;
        }
        if (original == duplicate) {
            System.out.println("armstrong number");

        } else {
            System.out.println(" not armstrong number");
        }

    }

}
