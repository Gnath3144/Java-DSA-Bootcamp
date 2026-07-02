package Day04.Problem05_StudentLeaderBoard;

import java.util.PriorityQueue;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
       PriorityQueue<Integer> leaderboard =
        new PriorityQueue<>(Collections.reverseOrder());
        leaderboard.offer(78);
        leaderboard.offer(95);
        leaderboard.offer(88);
        leaderboard.offer(67);
        leaderboard.offer(99);
        System.out.println(leaderboard);
        System.out.println(leaderboard.poll());

        while(!leaderboard.isEmpty())
{
    System.out.println(leaderboard.poll());s
}
    }

}