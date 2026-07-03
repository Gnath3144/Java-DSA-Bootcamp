package Day05.FunProblem_MostFreqex;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        String[] exes = {
                "Rahul",
                "Amit",
                "Rahul",
                "Karan",
                "Rahul",
                "Amit",
                "Rahul"
        };

        // Step 1: Create HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Step 2: Count frequency
        for (String ex : exes) {
            map.put(ex, map.getOrDefault(ex, 0) + 1);
        }

        // Print the HashMap
        System.out.println(map);

        // Step 3: Find most frequent ex
        String answer = "";
        int max = 0;

        for (String ex : map.keySet()) {

            if (map.get(ex) > max) {
                max = map.get(ex);
                answer = ex;
            }
            else if (map.get(ex) == max) {

                // Alphabetically smaller name wins
                if (answer.equals("") || ex.compareTo(answer) < 0) {
                    answer = ex;
                }
            }
        }

        System.out.println("\nStill Living Rent Free : " + answer);
        System.out.println("Mentioned " + max + " times.");
    }
}