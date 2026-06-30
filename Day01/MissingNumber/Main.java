package Day01.MissingNumber;

public class Main {
    public static void main(String[] args) {
        int attendance[] = {1, 2, 3, 4, 6, 7, 8, 9, 10};
        System.out.println("Missing number is: " + findMissing(attendance));
    }

    public static int findMissing(int arr[]) {
        int n = arr.length + 1;
        int total = n * (n + 1) / 2;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return total - sum;
    }
}