package mommy;

import java.util.Arrays;
import java.util.List;

public class Mommifier {
    // TODO Good use of final, but do they need to be instance variables?
    private final double vowelLimit = 0.3;
    private final List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');

    public String mommify(String word) {
        String result = "";
        int wordLength = word.length();

        // TODO I'm generally not a fan of if statements without braces, I find them more difficult to read. However,
        // there's another structure you could use here to make the end of this method simpler. Have you use the ternary
        // operator before? There's also another place in this file where you could use it.
        if (checkVowelCount(word, wordLength)) return word;
        return mommifyVowels(word, result, wordLength);
    }

    private String mommifyVowels(String word, String result, int wordLength) {
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

    private boolean previousLetterAVowel(String word, int letterPosition) {
        return letterPosition != 0 && vowels.contains(word.charAt(letterPosition - 1));
    }
}

