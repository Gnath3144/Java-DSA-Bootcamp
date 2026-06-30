import java.util.Scanner;

public class Main {

    // Method to count common letters
    public static int commonLetters(String first, String second) {

        int count = 0;

        first = first.toLowerCase();
        second = second.toLowerCase();

        for (int i = 0; i < first.length(); i++) {

            char ch = first.charAt(i);

            for (int j = 0; j < second.length(); j++) {

                if (ch == second.charAt(j)) {
                    count++;
                    break; // Avoid counting the same character multiple times
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=======================================");
        System.out.println("      ❤️ Crush Compatibility ❤️");
        System.out.println("=======================================");

        System.out.print("Enter Your Name: ");
        String name1 = sc.nextLine();

        System.out.print("Enter Crush Name: ");
        String name2 = sc.nextLine();

        int common = commonLetters(name1, name2);

        int totalLetters = name1.replace(" ", "").length()
                + name2.replace(" ", "").length();

        int percentage = (common * 100) / totalLetters;

        System.out.println();
        System.out.println("Common Letters : " + common);
        System.out.println("Compatibility : " + percentage + "%");

        System.out.println();

        if (percentage >= 80) {
            System.out.println("❤️ Made for each other!");
        } else if (percentage >= 60) {
            System.out.println("😊 Looks Promising!");
        } else if (percentage >= 40) {
            System.out.println("😅 Friend Zone Loading...");
        } else if (percentage >= 20) {
            System.out.println("😂 Better start with a Hi first!");
        } else {
            System.out.println("📚 Focus on placements first!");
        }

        sc.close();
    }
}