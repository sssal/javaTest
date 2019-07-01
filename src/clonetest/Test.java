package clonetest;

import java.util.Date;

public class Test {
    public static void main(String[] args){
        CloneObj c1 = new CloneObj();
        CloneObj c2 = (CloneObj)c1.clone();
        c2.changeData();
        System.out.println(c1.getBirth());
        System.out.println(c2.getBirth());
        System.out.println(c1.getBirth().hashCode());
        System.out.println(c2.getBirth().hashCode());
    }

}

class CloneObj implements Cloneable{
    private Date birth = new Date();

    public Date getBirth() {
        return birth;
    }

    public void changeData(){
        this.birth.setTime(4);
    }

    public Object clone(){
        CloneObj cloneObj = null;
        try{
            cloneObj = (CloneObj) super.clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        cloneObj.birth = (Date)this.birth.clone();
        return cloneObj;
    }
}
