package HomeWork3;


public class Task8 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        shiftArray(array, -3);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");

        }
    }
    private static void shiftArray(int arr[], int shift) {
        if (shift > 0) {
            for (int i = 0; i < shift; i++) {
                int n = arr[arr.length - 1];
                for (int j = arr.length; j > 0; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[0] = n;
            }
        } else {
            for (int i = 0; i > shift; i--) {
                int n = arr[0];
                for (int j = 0; j < arr.length; j++) {
                    arr[j - 1] = arr[j];
                }
                arr[arr.length - 1] = n;
            }
        }
    }
}
