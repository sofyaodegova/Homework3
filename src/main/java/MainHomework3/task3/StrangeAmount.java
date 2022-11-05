package MainHomework3.task3;

public class StrangeAmount {
    public static void main(String[] args) {

        int oddAmount = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1) {
                oddAmount += i;
            }
        }
        System.out.println("Сумма нечетных чисел = " + oddAmount);

        int dividedAmount = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                dividedAmount += i;
            }
        }
        System.out.println("Сумма четных чисел = " + dividedAmount);

        int total = (oddAmount - dividedAmount);
        System.out.println("Сумма чисел в диапазоне [1 ; 100], если четные числа отрицательные, а нечетные -" +
                " положительные = " + total);
    }
}