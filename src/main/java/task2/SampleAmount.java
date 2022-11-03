package task2;

public class SampleAmount {
    public static void main(String[] args) {

        int start = 1;
        int k = 4;
        int amount = start;

        do {
            System.out.println("amount = " + amount);
            amount = (start + (amount * k));
        } while (amount <= 100);
    }
}