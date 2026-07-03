package Day05.Problem01_BinarySearch;

public class Main {

    public static int binarySearch(int[] bookIds, int target)
    {
        int left = 0;
        int right = bookIds.length - 1;

        while(left <= right)
        {
            // Safe way of calculating middle
            int mid = left + (right - left) / 2;

            if(bookIds[mid] == target)
            {
                return mid;
            }
            else if(target > bookIds[mid])
            {
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args)
    {
        int[] bookIds = {5, 9, 12, 18, 25, 31, 40, 52, 68};

        int target = 31;

        int index = binarySearch(bookIds, target);

        if(index != -1)
        {
            System.out.println("Book Found!");
            System.out.println("Book ID : " + target);
            System.out.println("Book Found at Index : " + index);
        }
        else
        {
            System.out.println("Book Not Found!");
        }
    }
}