package mommy;

import java.util.Arrays;
import java.util.List;

/**
 * Created by jack on 04/05/2017.
 */
public class Mommifier {

    private double vowelLimit = 0.3;
    private List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');

    public String mommify(String word) {
        String result = "";
        int vowelCount = 0;
            for (int i = 0; i < word.length(); i++) {
                char letter = word.charAt(i);
                if (vowels.contains(letter)) {
                    vowelCount += 1;
                    if (!previousLetterAVowel(word, i)) {
                        result += "mommy";
                    }
                } else {
                    result += letter;
                }
            }
        if (vowelCount <= vowelLimit * word.length()) result = word;
        return result;
    }

    private Boolean previousLetterAVowel (String word, int letterPosition) {
        return letterPosition != 0 && vowels.contains(word.charAt(letterPosition - 1));
    }
}

