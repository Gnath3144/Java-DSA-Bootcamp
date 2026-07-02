public class Main {

    public static char firstNonRepeating(String message) {

        message = message.toLowerCase();

        int[] frequency = new int[26];

        // Count frequency of each alphabet
        for (char ch : message.toCharArray()) {

            if (ch >= 'a' && ch <= 'z') {
                frequency[ch - 'a']++;
            }
        }

        // Find the first non-repeating character
        for (char ch : message.toCharArray()) {

            if (ch >= 'a' && ch <= 'z' && frequency[ch - 'a'] == 1) {
                return ch;
            }
        }

        return '#';
    }

    public static void main(String[] args) {

        String message = "namaskara bengaluru";

        char result = firstNonRepeating(message);

        if (result == '#') {
            System.out.println("No non-repeating character found.");
        } else {
            System.out.println("First non-repeating character: " + result);
        }
    }
}