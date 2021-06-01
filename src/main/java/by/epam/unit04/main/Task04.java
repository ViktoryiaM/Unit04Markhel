package by.epam.unit04.main;

import java.util.Random;

public class Task04 {
  public static void main(String[] args) {
    int[] mas = new int[10];

    Random rand = new Random();
    for (int i = 0; i < mas.length; i++) {
      mas[i] = rand.nextInt(100);
      System.out.print(" " + mas[i]);
    }
    System.out.print("\n");
    int min, temp;
    for (int i = 0; i < mas.length - 1; i++) {
      min = i;
      for (int j = i + 1; j < mas.length; j++) {
        if (mas[j] < mas[min]) {
          min = j;
        }
      }
      temp = mas[i];
      mas[i] = mas[min];
      mas[min] = temp;
    }
    for (int i = 0; i < mas.length; i++) {
      System.out.print(" " + mas[i]);
    }
    System.out.println();
  }
}
