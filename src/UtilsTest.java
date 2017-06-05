import org.junit.Test;

import static org.junit.Assert.*;

public class UtilsTest {

    @Test
    public void validateEmail_valid() {
        assertTrue(Utils.validateEmail("bruno@gmail.com"));
    }

    @Test
    public void validateEmail_empty() throws Exception {
        assertFalse(Utils.validateEmail(""));
    }

    @Test
    public void validateEmail_noAt() {
        assertFalse(Utils.validateEmail("brunogmail.com"));
    }

    @Test
    public void validateEmail_twoAt() {
        assertFalse(Utils.validateEmail("bru@no@gmail.com"));
    }

    @Test
    public void validateEmail_illegalCharacters() {
        assertFalse(Utils.validateEmail("bru*#&^$(@no@gmail.com"));
    }

    @Test
    public void validateEmail_noDomain() {
        assertFalse(Utils.validateEmail("bruno@gmail"));
    }

    @Test
    public void joinStringArray_valid() {
        String[] sentence = new String[] {"Ala", "ma", "kota"};
        String joinedSentence = Utils.joinStringArray(sentence, " ");

        assertEquals(joinedSentence, "Ala ma kota");
    }

    @Test
    public void joinStringArray_single() {
        String[] sentence = new String[] {"BANG"};
        String joinedSentence = Utils.joinStringArray(sentence, " ");

        assertEquals(joinedSentence, "BANG");
    }


    //Nie działający test - metoda nie działa jak powinna
    @Test
    public void joinStringArray_empty() {
        String[] sentence = new String[] {};
        String joinedSentence = Utils.joinStringArray(sentence, ",");

        assertEquals(joinedSentence, "");
    }

}