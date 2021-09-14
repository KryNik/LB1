package com.company;

import java.util.Scanner;

public class mission3 {
    public static void main(String[] args) {
        System.out.print("Задайте размер массива: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] mas = new int[n];
        for (int i = 0; i < mas.length; i++) {
            Scanner in = new Scanner(System.in);
            mas[i] = in.nextInt();
        }
        for (int i : mas){
            System.out.printf("%d ", i);
        }
    }
}
