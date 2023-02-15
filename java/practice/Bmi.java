import java.util.Scanner;
import java.io.*;
public class Bmi {
    public static void main(String[] args) {
        float Weight,Height,BMI;
        String Gender;
        Scanner val=new Scanner(System.in);
        System.out.println("Enter The Weight  in Kgs:");
        Weight= val.nextFloat();
        System.out.println("Enter The Height in ms :");
        Height= val.nextFloat();
        System.out.println("Enter your Gender:");
        Gender= val.next();
        BMI=Weight/(Height*Height);
        System.out.println("Your BMI Value is:"+BMI);
        if(BMI>=27.8 && Gender=="Male"){
            System.out.println("You Are Obese man");
        }
        else{
            if(BMI>=25 && Gender=="Female"){
                System.out.println("You Are Obese Lady:");
            }
        }

    }
}
