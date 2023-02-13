import java.util.*;
public class prob2 {
    public static void check(int a,int b,int c){
        if(c>=a && c<=b){
            if(b>a){
                System.out.println("You Win");
            }
        }
        else{
            System.out.println("You lose");
        }
        

    }
    public static void main(String [] args){
        int a,b,c;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the first number");
        a=s.nextInt();
        System.out.println("Enter the second number");
        b=s.nextInt();
        System.out.println("Enter the third number");
        c=s.nextInt();
        check(a,b,c);

    }
    
}
