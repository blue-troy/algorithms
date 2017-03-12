package rabbitLive;

/**
 * Created by heyixin on 2017/3/12.
 * 某星球上出现了一种怪物， 这种怪物是单亲繁殖，从出生起第3个月起每个月就能繁衍一批后代共m个，但是这种怪物很短命，生存第5个月后就会毙命。目前该星球有一个这样的怪物，请编写程序计算n个月后怪物的总数。(这里我们假定第5个月怪物繁衍后再毙命)
 */
public class ForeignLive {
    public int solution(int n, int m) {
        if (n == 1 || n == 2) return 1;
        int month[] = new int[5]; //分别存储当前i月的动物

        month[0] = 1;
        int newLife = 0;
        //每一个月更新一次数组
        for (int i = 1; i < n; i++) {

            newLife = (month[2] + month[3] + month[4]) * m;

            for (int j = 1; j < 5; j++) {
                month[j] = month[j - 1];
            }

            month[0] = newLife;
        }

        int count = 0;
        for (int i = 0; i < 5; i++) {
            count += month[i];
        }

        return count;
    }

}
