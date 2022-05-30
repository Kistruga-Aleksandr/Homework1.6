import java.util.Random;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    static int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        Random random = new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        if (arr.length > 0) {
            int sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }
            System.out.println("—умма трат за мес€ц " + sum + " рублей");
        }
    }

    public static void task2() {
        int expensesMax = -1;
        int expensesMin = arr[0] + 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > expensesMax) {
                expensesMax = arr[i];
            }
            if (arr[i] < expensesMin) {
                expensesMin = arr[i];
            }

        }
        System.out.println("ћинимальна€ сумма трат за день составила " + expensesMin + " рублей. ћаксимальна€ сумма трат за день составила " + expensesMax + " рублей");

    }

    public static void task3() {
        double average = 0;
        if (arr.length > 0) {
            double sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }
            average = sum / arr.length;
        }
        System.out.println("—реднф€ сумма за мес€ц составила " + average + " рублей");
    }

    public static void task4() {
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i > 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }

}

