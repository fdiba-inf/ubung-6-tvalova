package exercise6;

import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean passwordValid = false;
        do {
          System.out.print("Enter password: ");
          String password = input.nextLine();

          if (password.length() < 8) {
            continue;
          }

          boolean lettersAndNumbers = true;
          int digitsCounter = 0;

          for (int i = 0; i < password.length(); i++) {
            char letter = password.charAt(i);

            if (!Character.isLetterOrDigit(letter)) {
              lettersAndNumbers = false;
              break;
            }

            boolean digitCount = Character.isDigit(letter);
            if (digitCount) {
              digitsCounter++;
            }
          }
          if (digitsCounter >= 2 && lettersAndNumbers) {
              passwordValid = true;
            } 
        } while (!passwordValid);
        System.out.println("Password valid!");
    }
}
