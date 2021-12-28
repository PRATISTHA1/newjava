public class duplicate {
    public static void main(String[] args) {

        int a[] = new int[] { 1, 2, 3, 3, 4, 5, 5 };
        for (int i = 0; i < 7; i++) {
            for (int j = i + 1; j < 7; j++) {
                if (a[i] == a[j]) {

                    System.out.println(a[j] + " ");
                }
            }
        }

    }

}
