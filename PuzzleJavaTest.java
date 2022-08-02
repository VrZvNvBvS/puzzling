public class PuzzleJavaTest {
  public static void main(String[] args) {
    PuzzleJava puzzleJava = new PuzzleJava();

    int[] randInts = puzzleJava.getTenRolls();
    for (int randInt : randInts) {
      System.out.println(randInt);
    }
  }
}

