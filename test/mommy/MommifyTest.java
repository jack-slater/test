package mommy;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MommifyTest {

    private Mommifier mommifier = new Mommifier();

    // TODO Are there any more test cases you could add here?
    // I think there's two cases you've missed: think about what's similar about all of your tests so far, and what
    // other inputs you could have; and also about the discussion we had around the shouldMommifyASingleVowel test.
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
        assertEquals("mommy", mommifier.mommify("e"));
        assertEquals("mommy", mommifier.mommify("i"));
        assertEquals("mommy", mommifier.mommify("o"));
        assertEquals("mommy", mommifier.mommify("u"));
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

    @Test
    public void shouldNotMommifyVowelsWhenExactly30PercentOfWord () {
        assertEquals("abcdefghij", mommifier.mommify("abcdefghij"));
    }

    @Test
    public void shouldMommifyVowelsAtStartAndEndOfAWord () {
        assertEquals("mommybbmommy", mommifier.mommify("aebbio"));
    }
}
