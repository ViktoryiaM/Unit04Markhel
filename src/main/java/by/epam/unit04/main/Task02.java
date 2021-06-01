package by.epam.unit04.main;

import java.util.Random;

public class Task02 {
  public static void main(String[] args) {
    int[] array = new int[5];


    Random rand = new Random();
    for (int i = 0; i < array.length; i++) {
      array[i] = rand.nextInt(50);
      System.out.print(" " + array[i]);
    }

    int min = array[0];
    int max = array[0];

    System.out.print("\n");
    for (int i = 1; i < array.length; i++) {
      if (array[i] > max) {
        max = array[i];
      }
      if (array[i] < min) {
        min = array[i];
      }
    }
    System.out.println(max);
    System.out.println(min);

    System.out.println(Math.abs(max - min));

  }
}
