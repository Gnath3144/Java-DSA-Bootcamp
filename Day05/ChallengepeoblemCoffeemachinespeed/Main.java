package Day05.Problem04_minimumServerCapacity;

public class Main {

    public static void main(String[] args)
    {
        int[] coffee = {3,6,7,11};
int breakTime = 8;

System.out.println(minimumSpeed(coffee, breakTime));
    }



    public static boolean isPossible(int[] workloads, int deadline, int capacity) {

        int totalHours = 0;

        for (int workload : workloads) {
            totalHours += (int) Math.ceil((double) workload / capacity);
        }

        return totalHours <= deadline;
    }

    public static int minimumCapacity(int[] workloads, int deadline) {

        int left = 0;

        for (int work : workloads) {
            left = Math.max(left, work);
        }

        int right = 0;

        for (int work : workloads) {
            right += work;
        }

        int answer = right;

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (isPossible(workloads, deadline, mid)) {
                answer = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return answer;
    }

    public static int minimumSpeed(int[] coffee,int breakTime)
{
    int left = 1;

    int right = 0;

    for(int cups : coffee)
    {
        right = Math.max(right,cups);
    }

    int answer = right;

    while(left<=right)
    {
        int mid = left + (right-left)/2;

        if(isPossible(coffee,breakTime,mid))
        {
            answer = mid;
            right = mid-1;
        }
        else
        {
            left = mid+1;
        }
    }

    return answer;
}
}