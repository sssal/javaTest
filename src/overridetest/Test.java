package overridetest;

public class Test {
    public static void main(String[] args){
        Father father = new Son();
        System.out.println(father.m());
    }
}

class Father{
    public float m(){
        return 1.0f;
    }
}

class Son extends Father{
//    @Override
//    public int m(){
//        return 1;
//    }
//    //编译错误
}
