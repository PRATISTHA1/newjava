package company;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int num = sc.nextInt();

        int flag = 0;
        if (num < 1) {
            System.out.println("negative number");
        } else {
            for (int i = 2; i < num - 1; i++) {
                if (num % i == 0) {
                    flag = 1;

                }
            }
            if (flag == 1) {
                System.out.println("not a prime number");
            } else {
                System.out.println(" a prime number");
            }
        }

    }
}
