package Day04.Problem02_LongestUniqueSubstring;
import java.util.HashSet;

public class Main {

    public static int longestSubstring(String traffic)
    {
        HashSet<Character> set=new HashSet<>();

        int left=0;

        int maximum=0;

        for(int right=0;right<traffic.length();right++)
        {
            char current=traffic.charAt(right);

            while(set.contains(current))
            {
                set.remove(traffic.charAt(left));
                left++;
            }

            set.add(current);

            maximum=Math.max(maximum,right-left+1);
        }

        return maximum;
    }

    public static void main(String[] args)
    {
        String traffic="abcabcbb";

        System.out.println(longestSubstring(traffic));
    }

}