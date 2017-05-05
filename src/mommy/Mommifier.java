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
        int wordLength = word.length();

        for (int i = 0; i < wordLength; i++) {
                char letter = word.charAt(i);
                if (vowels.contains(letter)) {
                    vowelCount += 1;
                    result = mommifyVowel(word, result, i);
                } else {
                    result += letter;
                }
            }

        return checkVowelCount(vowelCount, wordLength) ? word : result;
    }

    private boolean checkVowelCount(int vowelCount, int wordLength) {
        return vowelCount <= vowelLimit * wordLength;
    }

    private String mommifyVowel(String word, String result, int i) {
        if (!previousLetterAVowel(word, i)) {
            result += "mommy";
        }
        return result;
    }

    private Boolean previousLetterAVowel (String word, int letterPosition) {
        return letterPosition != 0 && vowels.contains(word.charAt(letterPosition - 1));
    }
}

