package dynamicPlanning;

/**
 * Created by heyixin on 2017/3/10.
 */
public class Exchange {
    public int countWays(int[] penny, int n, int aim) {
        return 0;
    }

    //暴力搜索方法
    public int coins(int[] penney, int aim) {
        if (penney == null || penney.length == 0 || aim < 0) return 0;
        return process(penney, 0, aim);
    }

    public int process(int[] penney, int index, int aim) {
        int result = 0;
        if (index == penney.length) {
            result = aim == 0 ? 1 : 0;//意思是找零时判断最后一个数能否成功找零，如果刚好使得aim为0则成功找零，计数加一。否则如果最后一位不能使结果为0，则加0
        } else {
            for (int i = 0; penney[index] * i <= aim; i++) {
                result += process(penney, index + 1, aim - penney[index] * i);
            }
        }
        return result;
    }

    //记忆搜索方法
    public int coins1(int[] penney, int aim) {
        if (penney == null || penney.length == 0 || aim < 0) return 0;
        int[][] map = new int[penney.length + 1][aim + 1];
        return process1(penney, 0, aim, map);
    }

    private int process1(int[] penney, int index, int aim, int[][] map) {
        int result = 0;
        if (index == penney.length) {
            result = aim == 0 ? 1 : 0;//意思是找零时判断最后一个数能否成功找零，如果刚好使得aim为0则成功找零，计数加一。否则如果最后一位不能使结果为0，则加0
        } else {
            int mapValue = 0;
            for (int i = 0; penney[index] * i <= aim; i++) {
                mapValue = map[index + 1][aim - penney[index] * i];
                if (mapValue != 0) {
                    result += mapValue == -1 ? 0 : mapValue;
                } else {
                    result += process1(penney, index + 1, aim - penney[index] * i, map);
                }
            }
        }
        return result;
    }
}
