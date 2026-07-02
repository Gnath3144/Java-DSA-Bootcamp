package Day03.Problem04_networkInfectionBFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        int vertices = 6;

        // Create Graph
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        // Initialize Graph
        for (int i = 0; i < vertices; i++) {
            graph.add(new ArrayList<>());
        }

        // Add Edges (Undirected Graph)
        graph.get(0).add(1);
        graph.get(1).add(0);

        graph.get(0).add(2);
        graph.get(2).add(0);

        graph.get(1).add(3);
        graph.get(3).add(1);

        graph.get(1).add(4);
        graph.get(4).add(1);

        graph.get(2).add(5);
        graph.get(5).add(2);

        // Print Graph
        System.out.println("Adjacency List:");
        System.out.println(graph);

        System.out.println("\nBFS Traversal:");

        // Call BFS
        bfs(graph, 0);
    }

    public static void bfs(ArrayList<ArrayList<Integer>> graph, int start) {

        Queue<Integer> queue = new LinkedList<>();

        boolean[] visited = new boolean[graph.size()];

        queue.offer(start);
        visited[start] = true;

        while (!queue.isEmpty()) {

            int current = queue.poll();

            System.out.print(current + " ");

            for (int neighbor : graph.get(current)) {

                if (!visited[neighbor]) {

                    visited[neighbor] = true;
                    queue.offer(neighbor);

                }
            }
        }
    }
}