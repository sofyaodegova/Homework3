package AdditionalTasks;

public class MultiplicationTable {
    public static void main(String[] args) {

        int number = 10; // - число, для которого выводим таблицу умножения
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = "
                    + (number * i)); // - выводим в консоль готовую таблицу умножения на 10.
        }
    }
}