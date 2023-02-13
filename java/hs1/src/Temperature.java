import java.util.Scanner;

class Temperature{
public static void main(String[] args){
double celsius,fahrenheit;
Scanner obj=new Scanner(System.in);
System.out.println("enter the celsius");
celsius=obj.nextDouble();
fahrenheit=(9/5)*celsius+32;
System.out.println("Equivalent fahrenhit is "  + fahrenheit);

}

}
