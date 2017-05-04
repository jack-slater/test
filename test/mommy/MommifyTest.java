package mommy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jack on 04/05/2017.
 */
public class MommifyTest {

    @Test
    public void shouldReturnAnEmptyStringWhenAnEmptyStringIsGiven () {
        Mommifier mommifier = new Mommifier();
        assertEquals("", mommifier.mommify(""));
    }

    @Test
    public void shouldNotMommifyASingleConsonant() {
        Mommifier mommifier = new Mommifier();
        assertEquals("b", mommifier.mommify("b"));
    }
}
