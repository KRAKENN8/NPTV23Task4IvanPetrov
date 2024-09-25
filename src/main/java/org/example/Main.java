import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            int num;
            do {
                num = random.nextInt(100);
            } while (num % 2 == 0);
            array[i] = num;
        }

        System.out.println("Сгенерированные нечетные числа:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }

        Arrays.sort(array);

        double sum = 0;
        for (int num : array) {
            sum += num;
        }
        double average = sum / array.length;

        System.out.println("\nОтсортированные нечетные числа:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }

        System.out.printf("\nСреднее арифметическое: %.2f", average);
    }
}
