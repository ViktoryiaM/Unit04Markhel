package by.epam.unit04.main;

import java.util.Random;

public class Task07 {
  public static void main(String[] args) {
    int[][] mas = new int[5][5];

    Random rand = new Random();
    for (int i = 0; i < mas.length; i++) {
      for (int j = 0; j < mas[i].length; j++) {
        mas[i][j] = rand.nextInt(100);
      }
    }
    for (int i = 0; i < mas.length; i++) {
      for (int j = 0; j < mas[i].length; j++) {
        System.out.print(mas[i][j] + "\t");
      }
      System.out.print("\n");
    }
    System.out.print("\n");
    for (int i = 0; i < mas.length; i++) {
      for (int j = 0; j < mas[i].length; j++) {
        if (i == j) {
          System.out.print(mas[i][j]);
        } else {
          System.out.print("\t");
        }
      }
      System.out.print("\n");
    }
  }
}

