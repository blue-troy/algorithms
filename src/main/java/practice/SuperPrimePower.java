package practice;

import java.util.Scanner;

/**
 * @author :heyixin
 * @version :3.0
 * @Title :${file_name}
 * @package :practice
 * @Description :${todo}
 * @date : 2017/3/14 11:37
 */
public class SuperPrimePower {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        scanner.close();
        boolean haveSuperPrimePower = false;

        double p;
        for (long q = 2; q * q <= n; q++) {
            p = Math.pow((double) n, 1d / q);

            //整除且为素数
            if ((long) p == p && isPrimeNumber((long) p)) {
                System.out.println((long) p + " " + q);
                haveSuperPrimePower = true;
                break;
            }
        }

        if (!haveSuperPrimePower) System.out.println("NO");

    }

    public static boolean isPrimeNumber(long n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
