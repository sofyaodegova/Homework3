package task5;

public class SimpleNumber {
    public static void main(String[] args) {
        System.out.println("Is the number simple? - " + simpleNumber(7));
    }

    public static boolean simpleNumber (int n) {
        if (n > 1) {
            for (int i = 2; i < n; i++)
                if (n % i == 0)
                    return false;
            return true;
        }
        else
            return false;
    }
}