import java.util.Scanner;
public class Sum1{
    public static void main(String[] args) {
        int n,fahrenhiet;
        Scanner p=new Scanner(System.in);
        System.out.println("Enter The Celcius Degree:");
        n= p.nextInt();
        fahrenhiet=(9*n/5)+32;
        System.out.println("The Fahrenhiet value is "+fahrenhiet);
    }
}
