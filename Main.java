import java.util.ArrayList;
import java.util.Random;

public class Main {
  public static void main(String[] args) {

    PuzzleJava generator = new PuzzleJava();

    System.out.println(generator.getTenRolls());
    System.out.println(generator.getRandomLetter());
    System.out.println(generator.generatePassword());
    System.out.println(generator.getNewPasswordSet(13));
  }
}
