package mommy;

/**
 * Created by jack on 04/05/2017.
 */
public class Mommifier {

    public String mommify(String word) {
        String result = "";
         for (int i = 0; i < word.length(); i++) {
             char letter = word.charAt(i);
             if (letter == 'a' || letter == 'i' ) {
                 result += "mommy";
             } else {
                 result += letter;
             }
         }
        return result;
    }
}
