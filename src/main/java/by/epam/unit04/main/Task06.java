package by.epam.unit04.main;

import java.util.Random;

public class Task06 {
  public static void main(String[] args) {
    int[][] mas = new int[4][4];
//    int[][] mas = new int[][] {{7, 2, 5, 6},{5, 7, 9, 11}, {1,7,5,7}};

    boolean sevenNumberIs = false;
    int countSevenNumbers = 0;

    Random rand = new Random();
    for (int i = 0; i < mas.length; i++) {
      for (int j = 0; j < mas[i].length; j++) {
        mas[i][j] = rand.nextInt(100);
      }
    }
    System.out.print("\n");
    for (int i = 0; i < mas.length; i++) {
      for (int j = 0; j < mas[i].length; j++) {
        System.out.print(" " + mas[i][j]);
      }
      System.out.print("\n");
    }
    for (int i = 0; i < mas.length; i++) {
      for (int j = 0; j < mas[i].length; j++) {
        if (mas[i][j] == 7) {
          sevenNumberIs = true;
          countSevenNumbers++;
        }
      }
    }
    System.out.print("\n" + "Количество семерок в матрице = " + countSevenNumbers);
    System.out.print("\n");
  }
}
