public class sort {
    public static void main(String[] args) {
        int a[] = new int[] { 1, 0, 2 };
        int temp = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < temp) {
                System.out.println(a[i] + " ");
            }

        }

    }
}
