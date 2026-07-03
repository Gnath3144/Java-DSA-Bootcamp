package Day04.Problem074_MergeBooking;
import java.util.Arrays;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args)
    {
        int[][] bookings = {
                {1,3},
                {2,6},
                {8,10},
                {15,18}
        };
        Arrays.sort(bookings,(a,b)->a[0]-b[0]);

        for(int[] booking : bookings)
{
    System.out.println(booking[0]+" "+booking[1]);
}

    
        ArrayList<int[]> mergedBookings = new ArrayList<>();

        int[] currentBooking = bookings[0];

        for(int i=1;i<bookings.length;i++)
        {
            if(currentBooking[1]>=bookings[i][0])
            {
                currentBooking[1] = Math.max(currentBooking[1],bookings[i][1]);
            }
            else
            {
                mergedBookings.add(currentBooking);
                currentBooking = bookings[i];
            }
        }

        mergedBookings.add(currentBooking);

        System.out.println("Merged Bookings:");

for(int[] booking : mergedBookings)
{
    System.out.println("[" + booking[0] + ", " + booking[1] + "]");
}
    }
    
}