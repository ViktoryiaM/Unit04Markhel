package by.epam.unit04.main;

import java.util.Random;

public class Task01 {
  public static <mas1> void main(String[] args) {

//    int[] mas = new int[] {1, 3, 5, 7, 9, 11};
    int[] mas = new int[10];
    int[] mas1 = new int[10];
    boolean hasEvenNumbers = false;

    Random rand = new Random();
    for (int i = 0; i < mas.length; i++) {
      mas[i] = rand.nextInt(100);
      System.out.print(" " + mas[i]);
    }
    System.out.print("\n");
    for (int i = 0; i < mas.length; i++) {
      if (mas[i] % 2 == 0 && mas[i] > 0) {
        mas1[i] = mas[i];
        hasEvenNumbers = true;
        System.out.print(" " + mas1[i]);
      }
    }
    System.out.print("\n");
    if (hasEvenNumbers != true) {
      System.out.print("В массиве нет четных чисел!");
    }
  }
}


