package hashCodeTest;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class Test {
    public static void main(String[] args){
        String s1 = new String("hello");
        String s2 = new String("hello");
        Hashtable<String,Integer> table = new Hashtable<>();
        table.put(s1,1);
        table.put(s2,2);
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.hashCode() == s2.hashCode());
        System.out.println(table.get(s1));
    }
}
