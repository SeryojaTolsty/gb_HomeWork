package HomeWork3;

import java.util.Arrays;

public class New {
    public static void main(String[] args) {
        shArr(new int[]{1, 2, 3}, 2);
    }

    private static void shArr(int[] arr, int n){
        int shNur = n % arr.length;
        if(shNur < 0){
            left(arr, shNur);
        } else {
            right(arr, shNur);
        }
        System.out.println(Arrays.toString(arr) + ", сдвиг на " + n + " знаков");
    }
    private static void right(int[] arr, int n){
        for (int i = 0; i < n; i++) {
            int point = arr[arr.length - 1];
            for (int j = arr.length - 1; j > 0; j--) {
                arr[j]  = arr[j - 1];
            }
            arr[0] = point;
        }
    }
    private static void left(int[] arr, int n){
        for (int i = 0; i < Math.abs(n); i++) {
            int point = arr[0];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = arr[j - 1];
            }
            arr[arr.length - 1] = point;
        }
    } 
}
