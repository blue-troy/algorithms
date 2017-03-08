package test;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        int N = 0, M = 0;
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            N = in.nextInt();
            M = in.nextInt();

            int[] score = new int[N];
            for (int i = 0; i < N; i++) {
                score[i] = in.nextInt();
            }

            String c = null;
            int a = 0, b = 0;
            for (int i = 0; i < M; i++) {
                c = in.next();
                a = in.nextInt();
                b = in.nextInt();
                process(c, a, b, score);
            }
        }
    }

    public static void process(String c, int a, int b, int[] score) {
        if (c.equals("Q")) {
            int max = 0;
            if (a > b) {
                int temp = a;
                a = b;
                b = temp;
            }
            for (int i = a; i <= b; i++) {
                if (score[i - 1] > max) {
                    max = score[i - 1];
                }
            }
            System.out.println(max);
        } else if (c.equals("U")) {
            score[a - 1] = b;
        }
    }
}