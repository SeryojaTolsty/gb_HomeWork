package HomeWork3;

public class NeRandom {
    public static void main(String[] args) {
        notRandomInversion();
        hunredArray();
        lessThenSix();
        diagonal();
        sixTask(3,5);
        sevenTask();
        int [] ar = {2, 2, 2, 1, 2, 2, 10, 1};
        System.out.println(newSevenTask(ar));


    }

    private static boolean newSevenTask(int[] ar) {
        for (int m : ar) System.out.print(m + " ");
        System.out.println();
        boolean a = false;
        int sum = 0;
        for (int i = 0; i < ar.length; i++) {
            sum += ar[i];
        }
        int rightSum = 0;
        for (int i = 0; i < ar.length; i++) {
            rightSum += ar[i];
            if (rightSum == sum - rightSum) a = true;
        }
        return a;
    }

    private static int[] createAr() {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()*10);
        }
        return arr;
    }


    private static void notRandomInversion() {
        int[] zeroOne = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < zeroOne.length; i++) {
            if (zeroOne[i] == 0) {
                zeroOne[i] = 1;
            } else {
                zeroOne[i] = 0;
            }
            System.out.println(zeroOne[i]);
        }
    }

    private static void hunredArray() {
        int[] arr = new int [100];
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + 1 + " ");
        }
        System.out.println();
    }
    private static void lessThenSix() {
        int[] les = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < les.length; i++) {
            if(les[i] < 6){
                les[i] = les[i] * 2;
            }
        System.out.print(les[i] + " ");
        }
    }
    private static void diagonal() {
        System.out.println();
    int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i == j || i + j == arr.length-1) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }
    }
    private static int[] sixTask(int len, int initialValue) {
        int [] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
        }
        for (int a : arr) System.out.print(a+" ");
        System.out.println();
        return arr;
    }

    private static void sevenTask() {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random()*10);
        }
        for (int a : arr) System.out.print(a + " ");
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
            if (arr[i] > max){
                max = arr[i];
            }
            
        }
        System.out.println("min = " + min + ", max = " + max);
    }


}
