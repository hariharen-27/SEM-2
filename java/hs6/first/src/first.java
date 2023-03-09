import java.util.*;
public class first {

    void overloading(int a,int b ){
        System.out.println(a+b);

    }
    void overloading(int a){
        System.out.println(a);
    }
    public static void main(String[] args){

        first obj=new first();
        System.out.println("single argument");
        obj.overloading(20);
        System.out.println("double argument");
        obj.overloading(20,20);




    }
}
