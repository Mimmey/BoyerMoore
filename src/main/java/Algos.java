import java.util.Arrays;

public class Algos {
    public static boolean boyerMoore(String str, String view) {
        int[] letters = new int[26];
        char[] viewChars = view.toCharArray();
        char[] strChars = str.toCharArray();
        Arrays.fill(letters, view.length());

        for (int i = view.length() - 2; i > 0; i--) {
            if (letters[viewChars[i] - 'a'] == view.length()) {
                letters[viewChars[i] - 'a'] = view.length() - i;
            }
        }

        int i = 0;
        int j = 0;
        while (i < strChars.length - viewChars.length
                && j < viewChars.length) {
            if (strChars[i] == viewChars[j]) {
                i++;
                j++;
            } else {
                i += letters[viewChars[viewChars.length - 1] - 'a'];
                j = 0;
            }
        }

        return j == viewChars.length;
    }
}
