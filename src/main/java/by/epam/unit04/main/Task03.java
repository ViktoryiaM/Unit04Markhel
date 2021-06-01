package by.epam.unit04.main;

import java.util.Random;

public class Task03 {
  public static void main(String[] args) {
    double[] array = new double[5];
//    double[] array = new double[]{-12, 345, 0, 334};
    int countPositive = 0;
    int countNegative = 0;
    int countZero = 0;

    Random rand = new Random();
    for (int i = 0; i < array.length; i++) {
      array[i] = 100 * rand.nextDouble();
      System.out.print(" " + array[i]);
    }
    System.out.print("\n");
    for (int i = 0; i < array.length; i++) {
      if (array[i] > 0) {
        countPositive++;
      } else if (array[i] < 0) {
        countNegative++;
      } else {
        countZero++;
      }
    }
    System.out.println("Количество положительных чисел: " + countPositive);

    System.out.println("Количество отрицательных чисел: " + countNegative);

    System.out.println("Количество нулевых чисел: " + countZero);
  }
}