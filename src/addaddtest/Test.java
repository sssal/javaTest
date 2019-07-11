package addaddtest;

public class Test {
    public static void main(String[] args){
        int i = 1,
            j = 2,
            k = 3;
//        System.out.println((i++));
        j += k-- / ++i;
        System.out.println(3/2);
        System.out.println(j);
        System.out.println(i);
        System.out.println(i+++i++);
        System.out.println(i);
        System.out.println(i++ + ++j);
        System.out.println(i);
    }
}
