package graphicUserInterface.graphicUserInterface_2_FromConsole;

import java.util.Scanner;

public class GetCodeFromUser {
    Scanner scanner;

    public GetCodeFromUser() {
        this.scanner = new Scanner(System.in);
    }

    public void closeScanner() {
        scanner.close();
    }

    private boolean checkString(String string) {
        Character zero = '0';
        Character one  =  '1';

        if (string.equals("Y")) {
            return false;
        }
        if (string.equals("y")) {
            return false;
        }

        if (string.length() !=10) {
            return false;
        }

        for (int i = 0; i < string.length(); i++) {
            if (zero == string.charAt(i) || one == string.charAt(i)) {
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }

    public String getStringFromUser() {
        System.out.println("Enter code (10 characters, only 0 and 1)");
        String str = scanner.next();
        if (checkString(str)) {
            System.out.println("Code has been written succesfully");
            System.out.printf("You entered: %s\n",str);
            return str;
        }
        else {

            System.out.println("Code is WRONG!\n");
            return null;
        }
    }

    public Scanner getScanner() {
        return scanner;
    }
}
