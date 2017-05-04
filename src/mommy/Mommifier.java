package mommy;

import java.util.Arrays;
import java.util.List;

/**
 * Created by jack on 04/05/2017.
 */
public class Mommifier {

    private List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');

    public String mommify(String word) {
        String result = "";
        int vowelCount = 0;
            for (int i = 0; i < word.length(); i++) {
                char letter = word.charAt(i);
                if (vowels.contains(letter)) {
                    result += "mommy";
                    vowelCount += 1;
                } else {
                    result += letter;
                }
            }
        double vowelPercentage = (double) vowelCount / word.length();
        if (vowelPercentage <= 0.3) return word;
        return result;
    }
}

