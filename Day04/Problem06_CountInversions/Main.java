package Day04.Problem06_CountInversions;

public class Main {

    public static void main(String[] args) {

        int[] ranking = {2, 4, 1, 3, 5};

        System.out.println("Number of Inversions: " + countInversions(ranking));
    }

    public static int countInversions(int[] ranking) {
        return mergeSort(ranking, 0, ranking.length - 1);
    }

    public static int mergeSort(int[] arr, int left, int right) {

        int inversions = 0;

        if (left < right) {

            int mid = (left + right) / 2;

            inversions += mergeSort(arr, left, mid);

            inversions += mergeSort(arr, mid + 1, right);

            inversions += merge(arr, left, mid, right);
        }

        return inversions;
    }

    public static int merge(int[] arr, int left, int mid, int right) {

        int[] temp = new int[right - left + 1];

        int i = left;
        int j = mid + 1;
        int k = 0;

        int inversions = 0;

        while (i <= mid && j <= right) {

            if (arr[i] <= arr[j]) {

                temp[k] = arr[i];
                i++;
                k++;

            } else {

                temp[k] = arr[j];
                j++;
                k++;

                inversions += (mid - i + 1);
            }
        }

        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }

        while (j <= right) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        for (int x = 0; x < temp.length; x++) {
            arr[left + x] = temp[x];
        }

        return inversions;
    }
}