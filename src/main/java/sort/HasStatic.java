package sort;

/**
 * @author :heyixin
 * @version :3.0
 * @Title :${file_name}
 * @package :sort
 * @Description :${todo}
 * @date : 2017/2/27 16:13
 */
public class HasStatic {

    public static int aMethod(int i)throws Exception
    {
        try{
            return i / 10;
        }
        catch (Exception ex)
        {
            throw new Exception("exception in a Method");
        } finally{
            System.out.printf("finally");
        }
    }

    public static void main(String [] args)
    {
        try
        {
            aMethod(0);
        }
        catch (Exception ex)
        {
            System.out.printf("exception in main");
        }
        System.out.printf("finished");
    }
}
