package by.epam.unit04.main;

import java.util.Random;

public class Task05 {
  public static void main(String[] args) {
    int[] mas = new int[10];

    Random rand = new Random();
    for (int i = 0; i < mas.length; i++) {
      mas[i] = rand.nextInt(100);
      System.out.print(" " + mas[i]);
    }
    System.out.print("\n");
    for (int i = 1; i < mas.length; i++) {
      int temp = mas[i];
      int j = i - 1;
      while (j >= 0 && temp < mas[j]) {
        if (mas[j] > temp) {
          mas[j + 1] = mas[j];
        }
        j = j - 1;
      }
      mas[j + 1] = temp;
    }
    for (int i = 0; i < mas.length; i++) {
      System.out.print(" " + mas[i]);
    }
  }
}
