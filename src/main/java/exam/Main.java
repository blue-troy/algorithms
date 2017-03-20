package exam;

import java.util.Scanner;

/**
 * Created by heyixin on 2017/3/19.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            strings[i] = scanner.next();
        }
        for (int i = 0; i < n; i++) {
            if (strings[i].contains("+") || strings[i].contains("-")) {
                strings[i] = strings[i].replaceAll("\\+","/\\\\");
                strings[i] = strings[i].replaceAll("\\-","__");
            }else {
                strings[i] = strings[i].replaceAll("__","-");
                strings[i] = strings[i].replaceAll("/\\\\","+");
            }

        }

        for (int i = 0; i < n; i++) {
            System.out.println(strings[i]);
        }

    }
}
