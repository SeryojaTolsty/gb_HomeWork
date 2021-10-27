package HomeWork3;

import java.util.Arrays;

public class HomeWork3 {

    public static void main(String[] args) {
        inversionArray();                                       //задание 1
        hundredArray();                                         //задание 2
        lessThenSix();                                          //задание 3
        quadrantArray();                                        //задание 4
        twoArgsMethod(3,5);                      //задание 5
        minMaxArray();                                         //задание 6
        int[] meth = {2, 2, 2, 1, 2, 2, 10, 1};                //задание 7
        System.out.println(checkBalanceArray(meth));
        shArr(new int[]{1, 2, 3}, 2);


    }


    private static void inversionArray() {
        int[] invert = {0, 1, 1, 0, 0, 1, 1, 0, 1};
        for (int i = 0; i < invert.length; i++) {
            if (invert[i] == 0) {
                invert[i] = 1;
            } else {
                invert[i] = 0;
            }
            System.out.print(invert[i] + " ");
        }
        System.out.println();
    }


    private static void hundredArray() {
        int[] hundred = new int[100];
        for (int i = 0; i < hundred.length; i++) {
            System.out.print(i + 1 + " ");
        }
        System.out.println();
    }


    private static void lessThenSix() {
        int[] lts = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < lts.length; i++) {
            if(lts[i] < 6) {
                lts[i] = lts[i] * 2;
            }
        System.out.print(lts[i] + " ");
        }
        System.out.println();
    }

    private static void quadrantArray() {
        int[][] quar = new int[5][5];
        for (int i = 0; i < quar.length; i++) {
            for (int j = 0; j < quar.length; j++) {
                if(i == j || i + j == quar.length - 1) {
                    quar[i][j] = 1;
                }
                System.out.print(quar[i][j] + " ");
            }
            System.out.println();
        }
    }


    private static int[] twoArgsMethod(int len, int initialValue) {
        int[] mass = new int[len];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = initialValue;
        }
        for (int a : mass) {
            System.out.print(a + " ");
            System.out.println();
        }
        return mass;
    }



    private static void minMaxArray() {
        int[] rand = new int[10];
        for (int i = 0; i < rand.length; i++) {
            rand[i] = (int) (Math.random()*10);
        }
        for (int a : rand)
            System.out.print(a + " ");
        System.out.println();
        int min = rand[0];
        int max = rand[0];
        for (int i = 0; i < rand.length; i++) {
            if(rand[i] < min){
                min = rand[i];
            }
            if(rand[i] > max){
                max = rand[i];
            }
        }
        System.out.println("min = " + min + ", max = " + max);
        System.out.println();
    }


    private static boolean checkBalanceArray(int[] meth) {
        for (int a : meth)
            System.out.print(a + " ");
        boolean a = false;
        int sum = 0;
        for (int i = 0; i < meth.length; i++) {
            sum = sum + meth[i];
        }
        int sideSum = 0;
        for (int i = 0; i < meth.length; i++) {
            sideSum = sideSum + meth[i];
            if(sideSum == sum - sideSum){
                a = true;
            }
        }
        return a;
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


