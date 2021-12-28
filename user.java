import java.util.Scanner;

public class user {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[4];
        System.out.println("enter array");
        for (int i = 0; i < 4; i++) {
            a[i] = sc.nextInt();
        }
    }

}
