package HomeWork;

public class Main {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();

    }

    private static void printThreeWords() {
        String threeStrings = "Orange\nBanana\nApple";
        System.out.println(threeStrings);
    }

    private static void checkSumSign() {
        int a = 5;
        int b = 7;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    private static void printColor() {
        int value = 85;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <=100) {
            System.out.println("Жёлтый");
        } else {
            System.out.println("Зелёный");
        }
    }

    private static void compareNumbers() {
        int a = 7;
        int b = 7;
        if (a >= b) {
            System.out.println("a >= b");
        } else  {
            System.out.println("a < b");
        }
    }

}

