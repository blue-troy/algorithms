package practice;

import java.util.Scanner;

/**
 * @author :heyixin
 * @version :3.0
 * @Title :${file_name}
 * @package :practice
 * @Description :${todo}
 * @date : 2017/3/13 16:48
 */
public class DNA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        int count = 0;

        if (a.length() != b.length()) System.out.println("0");

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == 'A' && b.charAt(i) != 'T') count++;
            else if (a.charAt(i) == 'C' && b.charAt(i) != 'G') count++;
            else if (a.charAt(i) == 'G' && b.charAt(i) != 'C') count++;
            else if (a.charAt(i) == 'T' && b.charAt(i) != 'A') count++;
        }
        System.out.println(count);
    }
}
