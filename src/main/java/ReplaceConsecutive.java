import java.util.Scanner;

public class ReplaceConsecutive {
    public static String replaceConsecutiveCharacters(String input) {
        StringBuilder result = new StringBuilder();
        int count = 1;
        char prevChar = '\0';

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            if (prevChar == currentChar) {
                count++;
            } else {
                if (count >= 3) {
                    result.append((char) (prevChar - 1));
                } else {
                    for (int j = 0; j < count; j++) {
                        result.append(prevChar);
                    }
                }
                count = 1;
                prevChar = currentChar;
            }
        }

        if (count >= 3) {
            result.append((char) (prevChar - 1));
        } else {
            for (int j = 0; j < count; j++) {
                result.append(prevChar);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("please enter a string: ");
        String input = scanner.nextLine();
        String output = replaceConsecutiveCharacters(input);
        System.out.println("Output: " + output);
    }
}