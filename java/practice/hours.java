import java.util.Scanner;

public class hours {
    public static void main(String[] args){
        int hour;
        Scanner vals=new Scanner(System.in);
        System.out.println("Enter the time in hours");
        hour=vals.nextInt();

        converts(hour);
    }
    static void converts(int a){
        int second;
        second=a*60*60;
        System.out.println(second);
    }
    }

