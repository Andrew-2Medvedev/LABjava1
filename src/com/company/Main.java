package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int  v = 0;

        try (final Scanner in = new Scanner(System.in)) {

            System.out.println("Введите целые положительные числа, чтобы узнать простые числа на промежутке между ними");
            int first;
            int second;
            while (true) {
                try {
                    String f = in.next();
                    first = Integer.parseInt(f);
                    String s = in.next();
                    second = Integer.parseInt(s);
                    if (first > second || first < 1) {
                        System.err.println("Первое число должно быть больше второго и они должны быть натуральными, первое больше второго. Повторите ввод.");
                        continue;
                    }
                    break;
                } catch (NumberFormatException e) {
                    System.err.println("Необходимо ввести число. Повторите ввод.");
                }
            }

            boolean[] arr = new boolean[32767];
            for (int i = 2; i <= second; i += 1)
                arr[i] = true;

            for (int i = 2; i <= second; i += 1)
                if (arr[i] == true) {
                    for (int j = i * i; j <= second; j += i)
                        arr[j] = false;
                }

            for (int i = first; i <= second; i += 1)
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
}
