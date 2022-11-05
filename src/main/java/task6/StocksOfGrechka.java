package task6;

public class StocksOfGrechka {
    public static void main(String[] args) {
        System.out.println("Василию нужно оплатить " + money(12, 100, 0, 0) + " руб. чтобы" +
                " оплатить хранение гречки на заданный период");
    }

    public static int money(int months, int stock, int min, int sum) {
        int cost = 100; // стоимость хранения 1 кг гречки
        int perMonth = 6; // сколько кг гречки в месяц потребляет Василий

        if (months <= min) {
            return sum;
        }

        if (months != 0) {
            sum = ((stock * cost) + sum);
            stock = stock - perMonth;
        }

        return money(--months, stock, min, sum);
    }
}