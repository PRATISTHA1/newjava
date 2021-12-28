package company;

import java.util.Scanner;

public class average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int one = sc.nextInt();
        int two = sc.nextInt();
        int average = (one + two) / 2;
        System.out.println("average is " + average);
    }

}
