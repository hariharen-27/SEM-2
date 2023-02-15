import java.util.Scanner;

public class Between {
    public static void main(String[] args){
        double First,Second;
        Scanner val=new Scanner(System.in);
        System.out.println("Enter The first value:");
        First= val.nextDouble();
        System.out.println("Enter The Second value:");
        Second= val.nextDouble();
        if(First>=0 && Second<=1 && First<=1 && Second>=0){
            System.out.println("True");
        }
        else{
            System.out.println("false");
        }
    }
}
