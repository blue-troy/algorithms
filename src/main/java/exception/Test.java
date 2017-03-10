package exception;

import java.io.IOException;

/**
 * Created by heyixin on 2017/3/10.
 */
public class Test {
    public static void main(String[] args) {
        runningTimeException();
    }

    //由java自动抛出
    static void runningTimeException() {
        int a = 4;
        int b = a / 0;
        int c = 4;
    }

    static void notRunningTimeException() throws IOException {

    }
}
