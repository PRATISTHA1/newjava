package company;

import java.util.Scanner;

public class swap {
    int swapping(int one, int two) {
        int three = 0;
        three = one;
        one = two;
        two = three;
        return 0;

    }

    public static void main(String[] args) {
        swap s = new swap();

        Scanner sc = new Scanner(System.in);
        int one = sc.nextInt();
        int two = sc.nextInt();
        System.out.println("before swap " + one + two);
        s.swapping(one, two);

        System.out.println("after swap " + one + two);

    }

}
