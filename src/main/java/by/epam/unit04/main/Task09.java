package by.epam.unit04.main;

import java.util.Random;

public class Task09 {
  public static void main(String[] args) {
    int n = 6;
    int[][] mas = new int[n][n];

    for (int i = 0; i < mas.length; i++) {
      mas[i][n - 1 - i] = i + 1;
    }
    for (int i = 0; i < mas.length; i++) {
      for (int j = 0; j < mas[i].length; j++) {
        System.out.print(mas[i][j] + "\t");
      }
      System.out.print("\n");
    }
  }
}


