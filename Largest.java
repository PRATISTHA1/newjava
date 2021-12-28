public class Largest {
    public static void main(String[] args) {

        int a[] = new int[] { 2, 1, 5, 8, 3, 6 };
        System.out.println("array is");
        for (int i = 0; i < a.length; i++) {
            System.out.println(" " + a[i]);
        }

        int largest = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > largest) {
                largest = a[i];
            }

        }
        System.out.println(" largest is" + largest);

    }

}
