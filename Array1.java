public class Array1 {
    public static void main(String[] args) {
        int counter = 0;
        int a[] = new int[] { 1, 2, 1, 3, 4, 5 };

        for (int i = 0; i < a.length; i++) {
            int temp = a[i];

            if (a[i] == temp) {
                counter++;
                System.out.println("frequency of " + a[i] + " is " + counter);

            }

        }
    }

}
