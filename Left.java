import java.util.Scanner;

public class Left {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" enter n");
        int n = sc.nextInt();

        int a[] = new int[] { 1, 2, 3, 4, 5 };
        int temp = 0;
        for (int x = 1; x <= n; x++) {
            temp = a[0];
            for (int i = 1; i < a.length; i++) {

                a[i - 1] = a[i];

            }
            a[a.length - 1] = temp;

        }

        System.out.println("array elements are ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

}
