package Problem03_productLocator;

public class Main {

    // Function to search the target in the sorted matrix
    public static boolean search(int matrix[][], int target) {

        int row = 0;
        int column = matrix[0].length - 1;

        while (row < matrix.length && column >= 0) {

            int current = matrix[row][column];

            System.out.println("Checking : " + current);

            if (current == target) {
                return true;
            } else if (current > target) {
                column--;
            } else {
                row++;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int matrix[][] = {
                {1, 4, 7, 11},
                {2, 5, 8, 12},
                {3, 6, 9, 16},
                {10, 13, 14, 20}
        };

        int target = 15;

        boolean result = search(matrix, target);

        if (result) {
            System.out.println("Target Found!");
        } else {
            System.out.println("Target Not Found!");
        }
    }
}