package MainHomework3.task3;

public class StrangeAmountRecTrying {
    public static void main(String[] args) {
        System.out.println("Сумма чисел в диапазоне [1 ; 100], если четные числа отрицательные, а нечетные - " +
                "положительные = " + Amount(0, 100, 1));
    }

    public static int Amount(int result, int max, int n) {
        if (n > max)
            return result;
        if (n % 2 != 0)
            result = result + n;
        if (n % 2 == 0)
            result = result - n;
        return Amount(result, max, ++n);
    }
}
