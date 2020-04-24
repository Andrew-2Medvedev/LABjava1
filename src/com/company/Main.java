package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n, v = 0;
        Scanner num = new Scanner (System.in);
        n = num.nextInt();
        boolean [] arr = new boolean[32767];
        for (int i = 2; i <= n; i += 1)
            arr[i]=true;

        for (int i = 2; i <= n; i += 1)
            if (arr[i] == true) {
                for (int j = i * i; j <= n; j += i)
                    arr[j] = false;
            }

        for (int i = 2; i <= n; i += 1)
            if (arr[i] == true) {
                 if (v > 10) {
                     v = 0;
                     System.out.println("");
                 }
                v += 1;
                System.out.printf("%6d", i);
                System.out.print(" ");
            }
        System.out.println("");
        System.out.println("Over");
	// write your code here
    }
}
