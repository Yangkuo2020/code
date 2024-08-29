import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ReplaceTest {

    @Test
    public void testStringReplacement() {
        String input = "abcccbad";
        String expectedOutput = "aacbad";
        String actualOutput = performReplacement(input);
        assertEquals(expectedOutput, actualOutput);
    }

    public String performReplacement(String input) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (i < input.length()) {
            int count = 1;
            while (i + count < input.length() && input.charAt(i) == input.charAt(i + count)) {
                count++;
            }
            if (count >= 3) {
                char replacementChar = (char) (input.charAt(i) - 1);
                result.append(replacementChar);
            } else {
                for (int j = 0; j < count; j++) {
                    result.append(input.charAt(i));
                }
            }
            i += count;
        }
        return result.toString();
    }
}
