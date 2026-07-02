package Day04.Problem04_DistinctUsersInWindow;

import java.util.HashMap;

public class Main {

    public static void distinctUsers(int[] users,int k)
    {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<k;i++)
        {
            map.put(users[i],map.getOrDefault(users[i],0)+1);
        }

        System.out.println(map.size());

        for(int i=k;i<users.length;i++)-
        {
            int outgoing = users[i-k];

            map.put(outgoing,map.get(outgoing)-1);

            if(map.get(outgoing)==0)
            {
                map.remove(outgoing);
            }

            int incoming = users[i];

            map.put(incoming,map.getOrDefault(incoming,0)+1);

            System.out.println(map.size());
        }
    }

    public static void main(String[] args)
    {
        int users[] = {1,2,1,3,4,2,3};

        int k = 4;

        distinctUsers(users,k);
    }

}