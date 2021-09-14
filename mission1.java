package com.company;

public class mission1 {

    public static void main(String[] args) {

        int mas[] = new int[] {100,2,3,4,5,6,7,8,9,-10};
        int min = 500, max = -500;

        for(int i = 0; i < mas.length; i++){
            if(mas[i] < min){
                min = mas[i];
            }
            if(mas[i] > max){
                max = mas[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
