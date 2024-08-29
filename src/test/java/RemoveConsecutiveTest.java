import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RemoveConsecutiveTest {

    @Test
    public void testRemoveConsecutiveSameCharacters() {
        String input = "aabcccbbad";
        String expected = "d";
        String result = removeConsecutiveSameCharacters(input);
        assertEquals(expected, result);
    }

    public static String removeConsecutiveSameCharacters(String str) {
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
                if (count < 3) {
                    sb.append(str.charAt(i - 1));
                }
            } else {
                count = 1;
                sb.append(str.charAt(i - 1));
            }
        }
        sb.append(str.charAt(str.length() - 1));
        String temp = sb.toString();
        sb.setLength(0);
        count = 1;
        for (int i = 1; i < temp.length(); i++) {
            if (temp.charAt(i) == temp.charAt(i - 1)) {
                count++;
                if (count < 3) {
                    sb.append(temp.charAt(i - 1));
                }
            } else {
                count = 1;
                sb.append(temp.charAt(i - 1));
            }
        }
        sb.append(temp.charAt(temp.length() - 1));
        return sb.toString();
    }
}