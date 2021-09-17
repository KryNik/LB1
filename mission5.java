package com.company;

import java.util.Random;
import java.util.Scanner;

public class mission5 {
    public static void main(String[] args) {

        String[] names = new String[] {"Andrew", "Liam", "Noah", "Oliver", "Olivia", "Charlotte", "Ava", "Emma", "William", "Sophia"};
        String[] surnames = new String[] {"Smith", "Brown", "Williams", "Johnson", "Kim", "Brooks", "James", "Gray", "Foster", "Lopez"};
        String[] fornames = new String[100];
        String[] forsurnames = new String[100];
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
            if(j != "")
                str3 = Integer.parseInt(j.trim());
        }
        catch (NumberFormatException e)
        {
            str3 = 0;
        }

        for (int i = 0; i < 100; i++) {
            //event[i] = 0;
            if (str1 != "" && str2 != "" && str3 != 0) {
                if (str1.equals(fornames[i]) && str2.equals(forsurnames[i]) && str3 == forages[i]) {System.out.println((i + 1) + " " + fornames[i] + " " + forsurnames[i] + " " + forages[i]);}
            }
            else if (str1 != "" && str2 != "" && str3 == 0) {
                if (str1.equals(fornames[i]) && str2.equals(forsurnames[i])) {System.out.println((i + 1) + " " + fornames[i] + " " + forsurnames[i] + " " + forages[i]);}
            }
            else if (str1 != "" && str2.equals("") && str3 != 0) {
                if (str1.equals(fornames[i]) && str3 == forages[i]) {System.out.println((i + 1) + " " + fornames[i] + " " + forsurnames[i] + " " + forages[i]);}
            }
            else if (str1.equals("") && str2 != "" && str3 != 0) {
                if (str2.equals(forsurnames[i]) && str3 == forages[i]) {System.out.println((i + 1) + " " + fornames[i] + " " + forsurnames[i] + " " + forages[i]);}
            }
            else if (str1 != "" && str2.equals("") && str3 == 0) {
                if (str1.equals(fornames[i])) {System.out.println((i + 1) + " " + fornames[i] + " " + forsurnames[i] + " " + forages[i]);}
            }
            else if (str1.equals("") && str2 != "" && str3 == 0) {
                if (str2.equals(forsurnames[i])) {System.out.println((i + 1) + " " + fornames[i] + " " + forsurnames[i] + " " + forages[i]);}
            }
            else if (str1.equals("") && str2.equals("") && str3 != 0) {
                if (str3 == forages[i]) {System.out.println((i + 1) + " " + fornames[i] + " " + forsurnames[i] + " " + forages[i]);}
            }
            else if (i == 99){System.out.println("\nThere is no such student");}
        }
    }
}
