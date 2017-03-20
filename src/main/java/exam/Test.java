package exam;

import java.util.*;

/**
 * Created by heyixin on 2017/3/19.
 */
public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<String, Integer> map = new HashMap<String, Integer>();
        //初始化
        for (int i = 0; i < n; i++) {
            map.put(scanner.next(), 0);
        }

        //输入全部
        Queue queue = new LinkedList();
        while (scanner.hasNextLine()) {
            queue.add(scanner.next());
        }
        scanner.close();

        //进行操作
        while (!queue.isEmpty()) {
            String faHonBao = (String) queue.poll();
            int mi = (int) queue.poll();
            int ki = (int) queue.poll();

            int fa = mi / ki;
            int keep = mi % ki;

            for (int i = 0; i < ki; i++) {
                String ge = (String) queue.poll();
                map.put(ge, map.get(ge) + fa);
            }
            map.put(faHonBao, keep);
        }

        for (Map.Entry<String, Integer> stringIntegerEntry : map.entrySet()) {
            System.out.println(stringIntegerEntry.getKey() + " " + stringIntegerEntry.getValue());
        }
    }
}
