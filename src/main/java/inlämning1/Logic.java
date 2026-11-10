package inlämning1;

import java.util.HashMap;

public class Logic {

    private HashMap<String, String> morseMap;
    private HashMap<String, String> abcMap;

    public Logic() {

        morseMap = new HashMap<>();
        abcMap = new HashMap<>();

        morseMap.put(".-", "A");
        morseMap.put("-...", "B");
        morseMap.put("-.-.", "C");
        morseMap.put("-..", "D");
        morseMap.put(".", "E");
        morseMap.put("..-.", "F");
        morseMap.put("--.", "G");
        morseMap.put("....", "H");
        morseMap.put("..", "I");
        morseMap.put(".---", "J");
        morseMap.put("-.-", "K");
        morseMap.put(".-..", "L");
        morseMap.put("--", "M");
        morseMap.put("-.", "N");
        morseMap.put("---", "O");
        morseMap.put(".--.", "P");
        morseMap.put("--.-", "Q");
        morseMap.put(".-.", "R");
        morseMap.put("...", "S");
        morseMap.put("-", "T");
        morseMap.put("..-", "U");
        morseMap.put("...-", "V");
        morseMap.put(".--", "W");
        morseMap.put("-..-", "X");
        morseMap.put("-.--", "Y");
        morseMap.put("--..", "Z");
        morseMap.put(" ", " ");
        morseMap.put("/", " ");

        abcMap.put("A", ".-");
        abcMap.put("B", "-...");
        abcMap.put("C", "-.-.");
        abcMap.put("D", "-..");
        abcMap.put("E", ".");
        abcMap.put("F", "..-.");
        abcMap.put("G", "--.");
        abcMap.put("H", "....");
        abcMap.put("I", "..");
        abcMap.put("J", ".---");
        abcMap.put("K", "-.-");
        abcMap.put("L", ".-..");
        abcMap.put("M", "--");
        abcMap.put("N", "-.");
        abcMap.put("O", "---");
        abcMap.put("P", ".--.");
        abcMap.put("Q", "--.-");
        abcMap.put("R", ".-.");
        abcMap.put("S", "...");
        abcMap.put("T", "-");
        abcMap.put("U", "..-");
        abcMap.put("V", "...-");
        abcMap.put("W", ".--");
        abcMap.put("X", "-..-");
        abcMap.put("Y", "-.--");
        abcMap.put("Z", "--..");
        abcMap.put(" ", " ");

    }

    public String translate(String morse) {
        return morseMap.get(morse);
    }

    public String translateAbc(String morse) {
        return abcMap.get(morse);
    }

    public String translateSentence(String input) {
        String[] morseLetters = input.split(" ");
        String result = "";

        for (String letter : morseLetters) {
            result += translate(letter);
        }
        return result;
    }

    public String translatetoMorse(String input) {
        String[] morseLetters = input.toUpperCase().split("");
        String result = "";

        for (String letter : morseLetters) {
            result += translateAbc(letter) + " ";
        }
        return result.trim();
    }

}

