package test.hashmapAndHashtable;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

/**
 * @author :heyixin
 * @version :3.0
 * @Title :${file_name}
 * @package :test.hashmapAndHashtable
 * @Description :HashMap和Hashtable都实现了Map接口，因此很多特性非常相似。但是，他们有以下不同点：
 * HashMap允许键和值是null，而Hashtable不允许键或者值是null。
 * Hashtable是同步的，而HashMap不是。因此，HashMap更适合于单线程环境，而Hashtable适合于多线程环境。
 * HashMap提供了可供应用迭代的键的集合，因此，HashMap是快速失败的。另一方面，Hashtable提供了对键的列举(Enumeration)。
 * 一般认为Hashtable是一个遗留的类。
 * @date : 2017/3/8 11:10
 */
public class Test {

    public static void main(String[] args) {
        Hashtable hashtable = new Hashtable();
        hashtable.put("hehe key", "hehe vallue");
//        hashtable.put(null, null); 不允许出现空
        hashtable.contains("");
        hashtable.containsKey("");
        hashtable.containsValue("");

        HashMap hashMap = new HashMap();
        hashMap.put("hehe key", "hehe value");
        hashMap.containsKey("");
        hashMap.containsValue(""); //没有contain方法

        System.out.println(hashtable.get("hehe key"));

        HashSet hashSet = new HashSet();
        hashSet.add("he");
        hashSet.add(null);
        hashSet.contains("hehe");
        hashSet.contains(null);
    }
}
