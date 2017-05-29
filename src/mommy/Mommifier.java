package mommy;

import java.util.Arrays;
import java.util.List;

public class Mommifier {

    private static final double vowelLimit = 0.3;
    private static final List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');

    public String mommify(String word) {
        String result = "";
        int wordLength = word.length();
        return checkVowelCount(word, wordLength) ? word : mommifyVowels(word, result, wordLength);
    }

    private String mommifyVowels(String word, String result, int wordLength) {
        for (int i = 0; i < wordLength; i++) {
            char letter = word.charAt(i);
            result = vowels.contains(letter) ? mommifyVowel(word, result, i) : result + letter;
        }
        return result;
    }

    private boolean checkVowelCount(String word, int wordLength) {
        int vowelCount = 0;
        for (int i = 0; i < wordLength; i++) {
            char letter = word.charAt(i);
            if (vowels.contains(letter)) {
                vowelCount += 1;
            }
        }
        return vowelCount <= vowelLimit * wordLength;
    }

    private String mommifyVowel(String word, String result, int i) {
        if (!previousLetterAVowel(word, i)) {
            result += "mommy";
        }
        return result;
    }

    private boolean previousLetterAVowel(String word, int letterPosition) {
        return letterPosition != 0 && vowels.contains(word.charAt(letterPosition - 1));
    }
}

