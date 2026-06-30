import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[][] intervals = {
                {9,11},
                {10,12},
                {2,4},
                {3,5}
        };

        Arrays.sort(intervals,(a,b)->a[0]-b[0]);

        ArrayList<int[]> result = new ArrayList<>();

        result.add(intervals[0]);

        for(int i=1;i<intervals.length;i++)
        {
            int[] last = result.get(result.size()-1);

            if(intervals[i][0] <= last[1])
            {
                last[1] = Math.max(last[1], intervals[i][1]);
            }
            else
            {
                result.add(intervals[i]);
            }
        }

        for(int[] meeting : result)
        {
            System.out.println(meeting[0] + " " + meeting[1]);
        }
    }
}