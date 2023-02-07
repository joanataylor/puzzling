import java.util.Random;
import java.util.ArrayList;

class PuzzleJava {
  Random randMachine = new Random();

  ArrayList<Integer> getTenRolls() {
    ArrayList<Integer> tenRolls = new ArrayList<Integer>();
    for (int i = 0; i < 10; i++) {
      tenRolls.add(randMachine.nextInt(20) + 1);
    }
    return tenRolls;
  }

  char getRandomLetter() {
    char[] alphabet = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
        'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
    int i = randMachine.nextInt(26);
    return alphabet[i];
  }

  String generatePassword() {
    String password = "";
    for (int i = 0; i < 9; i++) {
      password += getRandomLetter();
    }
    return password;
  }

  String getNewPasswordSet(int length) {
    String password = "";
    for (int i = 0; i <= length; i++) {
      password += getRandomLetter();
    }
    return password;
  }
}
