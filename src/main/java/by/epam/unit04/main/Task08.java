package by.epam.unit04.main;

import java.util.Random;
import java.util.Scanner;

public class Task08 {
  public static void main(String[] args) {
    int[][] mas = new int[6][6];
    Scanner sc;
    int k = 0;
    int p = 0;

    Random rand = new Random();
    for (int i = 0; i < mas.length; i++) {
      for (int j = 0; j < mas[i].length; j++) {
        mas[i][j] = rand.nextInt(150);
      }
    }
    for (int i = 0; i < mas.length; i++) {
      for (int j = 0; j < mas[i].length; j++) {
        System.out.print(mas[i][j] + "\t");
      }
      System.out.print("\n");
    }
    System.out.print("\n");

    sc = new Scanner(System.in);
    System.out.print("> ");
    k = sc.nextInt();
    if (k >= 0 && k < mas.length) {
      System.out.println("k-ая строка: ");

      for (int j = 0; j < mas[k].length; j++) {

        System.out.print(mas[k][j] + "\t");
      }
    } else {
      System.out.println("Неверное значение k. Попробуйте еще раз.");
    }
    System.out.print("\n");
    sc = new Scanner(System.in);
    System.out.print("> ");
    p = sc.nextInt();
    if (p >= 0 && p < mas.length) {
      System.out.println("p-ый столбец: ");

      for (int i = 0; i < mas.length; i++) {
        System.out.println(mas[i][p] + "\t");
      }
    } else {
      System.out.println("Неверное значение p. Попробуйте еще раз.");
    }
    System.out.print("\n");
  }
}