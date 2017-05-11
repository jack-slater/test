package mommy;

import java.util.Arrays;
import java.util.List;

public class Mommifier {

    // TODO Do either of these variables need to change depending on the instantiated object?
    private double vowelLimit = 0.3;
    private List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');

    public String mommify(String word) {
        String result = "";
        int wordLength = word.length();
        if (checkVowelCount(word, wordLength)) return word;
        for (int i = 0; i < wordLength; i++) {
            char letter = word.charAt(i);
            if (vowels.contains(letter)) {
                result = mommifyVowel(word, result, i);
            } else {
                result += letter;
            }
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

    // TODO If you don't need to use the methods on the Boolean class, it's probably better to stick to the primitive
    private Boolean previousLetterAVowel(String word, int letterPosition) {
        return letterPosition != 0 && vowels.contains(word.charAt(letterPosition - 1));
    }
}

