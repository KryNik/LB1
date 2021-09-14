package com.company;

public class mission4 {
    public static void main(String[] args) {
        int[][] mas = new int[][]
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                };
        int[] sum = getSumofColumns(mas);
        for (int i = 0; i < sum.length; i++) {
            System.out.println("sum of column " + (i + 1) + " is " + sum[i]);
        }
    }

    public static int[] getSumofColumns(int[][] mas){
        int[] sum=new int[mas[0].length];
        for(int i=0;i<mas.length;i++){
            for(int j=0;j<mas[i].length;j++){
                sum[j]+=mas[i][j];
            }
        }
        return sum;
    }
}
