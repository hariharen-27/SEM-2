import java.util.*;
public class prob1 {
    public static void Sum(int a,int b){
        int res;
        res=a+b;
        if(res<100){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
    public static void main(String[] args){
        int a,b;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the first number:");
        a=s.nextInt();
        System.out.print("Enter the second number:");
        b=s.nextInt();
        Sum(a,b);
    }

    
}
