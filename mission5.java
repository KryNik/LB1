package com.company;

import org.apache.commons.lang3.ArrayUtils;
import java.lang.reflect.Array;
import java.util.Random;
import java.util.Scanner;
import java.util.StringJoiner;
import java.util.Vector;

public class mission5 {
    public static void main(String[] args) {

        String[] names = new String[] {"Andrew", "Liam", "Noah", "Oliver", "Olivia", "Charlotte", "Ava", "Emma", "William", "Sophia"};
        String[] surnames = new String[] {"Smith", "Brown", "Williams", "Johnson", "Kim", "Brooks", "James", "Gray", "Foster", "Lopez"};
        String[] fornames = new String[100];
        String[] forsurnames = new String[100];
        int[] event = new int[100];
        int[] forages = new int[100];
        int[] fornumber = new int[100];

        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            fornames[i] = names[random.nextInt(names.length)];
            forsurnames[i] = surnames[random.nextInt(surnames.length)];
            forages[i] = (int) ((Math.random() * (27 - 18)) + 18);
            fornumber[i] = i + 1;
            System.out.println(fornumber[i] + " " + fornames[i] + " " + forsurnames[i] + " " + forages[i]);
        }

        System.out.println("\nEnter name:");
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        System.out.println("Enter surname:");
        Scanner in1 = new Scanner(System.in);
        String str2 = in1.nextLine();
        System.out.println("Enter age:");
        Scanner in2 = new Scanner(System.in);
        String j = in2.nextLine();
        int str3 = 0;
        try
        {
            if(j != null)
                str3 = Integer.parseInt(j.trim());
        }
        catch (NumberFormatException e)
        {
            str3 = 0;
        }

        for (int i = 0; i < 100; i++) {
            if (str1 != null && str2 != null && str3 != 0) {
                if (str1.equals(fornames[i]) && str2.equals(forsurnames[i]) && str3 == forages[i]) {event[i] = 1;}
            }
            else if (str1 != null && str2 != null && str3 == 0) {
                if (str1.equals(fornames[i]) && str2.equals(forsurnames[i])) {event[i] = 2;}
            }
            else if (str1 != null && str2 == null && str3 != 0) {
                if (str1.equals(fornames[i]) && str3 == forages[i]) {event[i] = 3;}
            }
            else if (str1 == null && str2 != null && str3 != 0) {
                if (str2.equals(forsurnames[i]) && str3 == forages[i]) {event[i] = 4;}
            }
            else if (str1 != null && str2 == null && str3 == 0) {
                if (str1.equals(fornames[i])) {event[i] = 5;}
            }
            else if (str1 == null && str2 != null && str3 == 0) {
                if (str2.equals(forsurnames[i])) {event[i] = 6;}
            }
            else if (str1 == null && str2 == null && str3 != 0) {
                if (str3 == forages[i]) {event[i] = 7;}
            }

            if (event[i] == 1){
                System.out.println((i + 1) + " " + fornames[i] + " " + forsurnames[i] + " " + forages[i]);}
            else if (event[i] == 2) {
                System.out.println((i + 1) + " " + fornames[i] + " " + forsurnames[i] + " " + forages[i]);}
            else if (event[i] == 3){
                System.out.println((i + 1) + " " + fornames[i] + " " + forsurnames[i] + " " + forages[i]);}
            else if (event[i] == 4){
                System.out.println((i + 1) + " " + fornames[i] + " " + forsurnames[i] + " " + forages[i]);}
            else if (event[i] == 5){
                System.out.println((i + 1) + " " + fornames[i] + " " + forsurnames[i] + " " + forages[i]);}
            else if (event[i] == 6){
                System.out.println((i + 1) + " " + fornames[i] + " " + forsurnames[i] + " " + forages[i]);}
            else if (event[i] == 7){
                System.out.println((i + 1) + " " + fornames[i] + " " + forsurnames[i] + " " + forages[i]);}
            //else if (i == 99 && event[i] == 0) {System.out.println("\nThere is no such student");}
        }
    }
}