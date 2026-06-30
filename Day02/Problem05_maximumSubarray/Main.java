package Day02.Problem05_maximumSubarray;

public class Main {

    public static int maximumProfit(int[] profit)
{
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int value : profit)
        {
            currentSum += value;
            maxSum = Math.max(maxSum, currentSum);
            if(currentSum < 0)
            {
                currentSum = 0;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int profit[] = {-2,-3,5,-1,5,2};
        System.out.println(maximumProfit(profit));
    }
}

