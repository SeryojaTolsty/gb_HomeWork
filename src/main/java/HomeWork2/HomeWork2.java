package HomeWork2;


public class HomeWork2 {
    public static void main(String[] args) {
        boolean isNum = twoInt(5,6);
        System.out.println(isNum);
        positiveOrNegativeNumber(6);
        boolean trueNum = trueNum(-5);
        System.out.println(trueNum);
        boolean year = leapYear(2021);
        System.out.println(year);
    }

    public static boolean twoInt(int a, int b) {
        int sum = a + b;
        if(sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }


    private static void positiveOrNegativeNumber(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }



    private static boolean trueNum(int a) {
        if(a < 0) {
            return true;
        } else {
            return false;
        }
    }




    private static boolean leapYear(int a) {
       if (a % 4 == 0){
           return true;
       }
       if (a % 100 == 0){
           return false;
       }
       if (a % 400 == 0) {
           return true;
       }
        return false;
    }
}




    





