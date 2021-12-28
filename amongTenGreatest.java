
package company;

import java.util.Scanner;

public class amongTenGreatest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter numbers");
        int num[] = new int[5];
        for (int i = 0; i < 5; i++) {
            num[i] = sc.nextInt();
        }
        int greatest;

        greatest = num[1];
        for (int i = 0; i < 5; i++) {
            if (num[i] > num[1]) {
                greatest = num[i];
            }

        }

        System.out.println("greatest number is " + greatest);

    }
}