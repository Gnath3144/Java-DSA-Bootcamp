package Day05.Problem02_FIrstAndLastOccurance;

public class Main {

    public static void main(String[] args)
    {
        int[] inventory = {2,4,4,4,4,7,9,12};

        int target = 4;
        int first = firstOccurrence(inventory, target);
        int last = lastOccurrence(inventory, target);
        System.out.println("First occurrence of " + target + " is at index: " + first);
        System.out.println("Last occurrence of " + target + " is at index: " + last);
    }

public static int firstOccurrence(int[] inventory,int target)
{
    int left=0;
    int right=inventory.length-1;

    int answer=-1;

    while(left<=right)
    {
        int mid=left+(right-left)/2;

        if(inventory[mid]==target)
        {
            answer=mid;
            right=mid-1;
        }
        else if(target>inventory[mid])
        {
            left=mid+1;
        }
        else
        {
            right=mid-1;
        }
    }

    return answer;
}

public static int lastOccurrence(int[] inventory,int target)
{
    int left=0;
    int right=inventory.length-1;

    int answer=-1;

    while(left<=right)
    {
        int mid=left+(right-left)/2;

        if(inventory[mid]==target)
        {
            answer=mid;
            left=mid+1;
        }
        else if(target>inventory[mid])
        {
            left=mid+1;
        }
        else
        {
            right=mid-1;
        }
    }

    return answer;
}
}