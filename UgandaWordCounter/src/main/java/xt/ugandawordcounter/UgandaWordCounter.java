import java.util.Scanner;

public class UgandaWordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt for input
        System.out.println("Enter book description:");
        String description = scanner.nextLine();

        // Normalize the input
        String lowerDescription = description.toLowerCase();
        String targetWord = "uganda";

        // Split into words
        String[] words = lowerDescription.split("\\W+"); // Splits by non-word characters

        int count = 0;
        for (String word : words) {
            if (word.equals(targetWord)) {
                count++;
            }
        }

        System.out.println("The word 'Uganda' appears " + count + " times.");
    }
}


