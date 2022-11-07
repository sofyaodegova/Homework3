package AdditionalTasks;

public class MultiplicationTable {
    public static void main(String[] args) {

        int i = 1;
        int a = 1;
        while (i <= 10) {
            while (a <= 10) {
                System.out.print(i * a + " ");
                a++;
            }
            System.out.println();
            i++;
            a = 1;
        }
    }
}
