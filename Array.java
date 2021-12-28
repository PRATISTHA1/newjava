
public class Array {
    public static void main(String[] args) {
        int[] arr1 = new int[] { 1, 2, 3, 4, 5 };

        // Create another array arr2 with size of arr1
        int arr2[] = new int[5];
        // Copying all elements of one array into another
        for (int i = 0; i < 5; i++) {
            arr2[i] = arr1[i];
        }
        // Displaying elements of array arr1
        System.out.println("Elements of original array: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(arr1[i] + " ");
        }

        System.out.println();

        System.out.println("Elements of new array: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(arr2[i] + " ");
        }
    }

}
