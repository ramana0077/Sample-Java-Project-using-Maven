import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of values: ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please provide a valid number of values.");
            return;
        }

        int[] numbers = new int[n];
        System.out.println("Enter the list of numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        Arrays.sort(numbers);

        double mean = calculateMean(numbers);
        double median = calculateMedian(numbers);
        int mode = calculateMode(numbers);

        System.out.println("Mean: " + mean);
        System.out.println("Median: " + median);
        System.out.println("Mode: " + mode);
    }

    private static double calculateMean(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return (double) sum / numbers.length;
    }

    private static double calculateMedian(int[] numbers) {
        int middle = numbers.length / 2;
        if (numbers.length % 2 == 0) {
            double left = numbers[middle - 1];
            double right = numbers[middle];
            return (left + right) / 2;
        } else {
            return numbers[middle];
        }
    }

    private static int calculateMode(int[] numbers) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int maxFrequency = 0;
        int mode = -1;

        for (int num : numbers) {
            int frequency = frequencyMap.getOrDefault(num, 0) + 1;
            frequencyMap.put(num, frequency);

            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                mode = num;
            }
        }

        return mode;
    }
}
