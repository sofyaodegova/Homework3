package MainHomework3.task4;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println(fizzBuzz(100, 0));
    }

    public static int fizzBuzz(int max, int n) {
        if (n >= max)
            return max;

        if (n % 3 == 0 && n % 5 == 0)
            System.out.println(n + " - FizzBuzz");

        else if (n % 5 == 0)
            System.out.println(n + " - Buzz");

        else if (n % 3 == 0)
            System.out.println(n + " - Fizz");

        else
            System.out.println(n);

        return fizzBuzz(max, ++n);
    }
}