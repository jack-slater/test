package mommy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jack on 04/05/2017.
 */
public class MommifyTest {

    private Mommifier mommifier = new Mommifier();

    @Test
    public void shouldReturnAnEmptyStringWhenAnEmptyStringIsGiven () {
        assertEquals("", mommifier.mommify(""));
    }

    @Test
    public void shouldNotMommifyASingleConsonant() {
        assertEquals("b", mommifier.mommify("b"));
    }

    @Test
    public void shouldMommifyASingleVowel () {
        assertEquals("mommy", mommifier.mommify("a"));
    }

    @Test
    public void shouldMommifyAVowelWhenGivenAVowelAndAConsonant() {
        assertEquals("bmommy", mommifier.mommify("bi"));
    }

    @Test
    public void shouldNotMommifyAVowelWhenItIs30PercentOrLessOfAWord () {
        assertEquals("bcde", mommifier.mommify("bcde"));
    }

    @Test
    public void shouldMommifyTwoConsecutiveVowelsIntoOnlyOneMommy () {
        assertEquals("rmommyt", mommifier.mommify("riot"));
    }
}
