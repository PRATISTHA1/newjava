package company;

public class fibbonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.println("fibbonacci series is");
        System.out.println("" + a);
        System.out.println("" + b);
        int c;
        for (int i = 0; i < 6; i++) {
            c = a + b;
            a = b;
            b = c;
            System.out.println("" + c);
        }
    }
}
