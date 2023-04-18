package hs10;
import java.util.*;
public class myclass {
    static void  method1(){
       
    }
    static void method2(){
        method1();
    }
    static void method3(){
        method2();
        File file=new File("filename.txt");
        Scanner sc=new Scanner(file);

    }
    public static void main(String[] args){
        //method2();

    }
    
}
