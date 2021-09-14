package com.company;

public class mission2 {
    public static void main(String[] args) {
        int mas[] = new int[10];

        for (int i = 0; i < mas.length; i++){
            mas[i] = (int) Math.round((Math.random() * 30) - 15);
            System.out.println(mas[i]);
        }
    }
}
