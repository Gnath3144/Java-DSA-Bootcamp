import java.util.Arrays;

public class Main {

    public static void insertionSort(int[] salaries) {

        for (int i = 1; i < salaries.length; i++) {

            int key = salaries[i];
            int j = i - 1;

            while (j >= 0 && salaries[j] > key) {
                salaries[j + 1] = salaries[j];
                j--;
            }

            salaries[j + 1] = key;
        }
    }

    public static void main(String[] args) {

        int[] salaries = {60000, 45000, 120000, 90000, 30000};

        System.out.println("Before Sorting:");
        System.out.println(Arrays.toString(salaries));

        insertionSort(salaries);

        System.out.println("After Sorting:");
        System.out.println(Arrays.toString(salaries));
    }
}