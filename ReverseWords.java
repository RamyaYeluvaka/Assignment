import java.util.Scanner;

public class ReverseWords {
    public static String reverseWordsInSentence(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder reversedSentence = new StringBuilder();

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word).reverse();
            reversedSentence.append(reversedWord).append(" ");
        }

        return reversedSentence.toString().trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String inputSentence = scanner.nextLine();
        String reversedSentence = reverseWordsInSentence(inputSentence);

        System.out.println("Input Sentence: " + inputSentence);
        System.out.println("Reversed Sentence: " + reversedSentence);

        scanner.close();
    }
}

