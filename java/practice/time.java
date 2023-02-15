import java.util.Scanner;
public class time {
    public static void main(String[] args){
        int minutes;
        Scanner val=new Scanner(System.in);
        System.out.println("Enter the time minutes");
        minutes=val.nextInt();

        convert(minutes);
    }
    static void convert(int a){
        int seconds;
        seconds=a*60;
        System.out.println(seconds);
    }
}
