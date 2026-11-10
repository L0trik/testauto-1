package inlämning1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Testing {

    @Test
    public void testtranslatetoMorse() {
        Logic logic = new Logic();
        String input = "e";
        String actual = logic.translatetoMorse(input);
        String expected = ".";
        assertEquals(expected, actual);
    }

    @Test
    public void testtranslateSentence() {
        Logic logic = new Logic();
        String input = "... --- ...";
        String result = logic.translateSentence(input);
        assertEquals(result, "SOS");
    }

    @Test
    public void testmainPick() {
        Main main = new Main();
        String pick = "hej";

        try {
            int val = Integer.parseInt(pick);
            if (val == 1) {
                System.out.println("text");
            } else if (val == 2) {
                System.out.println("morse");
            }
        }
        catch(NumberFormatException e){
            System.out.println("1 eller 2");
        }

    }


    @Test
    public void testtranslateLetter2() {
        Logic logic = new Logic();
        String input = ".";
        String actual = logic.translateSentence(input);
        String expected = "E";
        assertEquals(expected, actual);
    }

    @Test
    public void testtranslateLetter3() {
        Logic logic = new Logic();
        String input = "1";
        String actual = logic.translatetoMorse(input);
        String expected = "null";
        assertEquals(expected, actual);
    }
    @Test
    public void testtranslateLetter4() {
        Logic logic = new Logic();
        String input = "-. ..- .-.. .-..";
        String actual = logic.translateSentence(input);
        String expected = "NULL";
        assertEquals(expected, actual);
    }


}

