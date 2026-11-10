package inlämning1;


import java.util.Scanner;

public class Main {

    public static void main() {
        Scanner scan = new Scanner(System.in);
        Logic morse = new Logic();

        boolean braval = false;
        while (!braval) {

            System.out.println("vad vill du göra \nmorse till text: 1 \ntext till mosre: 2");
            String pick = scan.nextLine();
            try {
                int val = Integer.parseInt(pick);

                if (val == 1) {
                    System.out.println("vad vill du översätta till text?");
                    String input = scan.nextLine();
                    System.out.println(morse.translateSentence(input));
                    braval = true;
                } else if (val == 2) {
                    System.out.println("vad vill du översätta till morse?(tänk på att åäö inte finns!");
                    String input = scan.nextLine();
                    System.out.println(morse.translatetoMorse(input));
                    braval = true;
                }
            } catch (NumberFormatException e) {
                System.out.println("du måste först välja 1 eller 2");
            }
        }
    }

}
