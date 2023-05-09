import java.util.*;
public class passwordGenerator {
    public static void main(String[] args) {
        int i=0;
        int len,temp=0,count=0;
        char uchoice,lchoice,symchoice,numchoice;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the size of length: ");
        len=s.nextInt();
        String upperCase="ABCDEFGHIJKLMNOPMNQRSTUVWXYZ";
        String lowerCase="abcdefghijklmnopqrstuvwxyz";
        String numbers="1234567890";
        String symbols="!@#$%&";
        String combined="";
        Random random= new Random();

        String[] required=new String[4];
       
        System.out.println("Do you wish to include uppercase in your password[y/n]? ");
        uchoice=s.next().charAt(0);
        if(uchoice=='y' || uchoice=='Y')
        {
            required[temp]=upperCase;
            combined+=upperCase;
            temp++;
        }
        System.out.println("Do you wish to include lowercase in your password[y/n]? ");
        lchoice=s.next().charAt(0);
        if(lchoice=='y' || lchoice=='Y')
        {
            required[temp]=lowerCase;
            combined+=lowerCase;
            temp++;
        }
        System.out.println("Do you wish to include symbols in your password[y/n]? ");
        symchoice=s.next().charAt(0);
        if(symchoice=='y' || symchoice=='Y')
        {
            required[temp]=symbols;
            combined+=symbols;
            temp++;
        }
        System.out.println("Do you wish to include numbers in your password[y/n]? ");
        numchoice=s.next().charAt(0);
        if(numchoice=='y' || numchoice=='Y')
        {
            required[temp]=numbers;
            combined+=numbers;
            temp++;
        }
       
        for (String string : required) {
            count++;
        }
       
        char[] password=new char[len];

 for(i=0;i<temp;i++)
 {
    password[i] = required[i].charAt(random.nextInt(required[i].length()));
 }
for ( ; i < len; i++) {
    password[i]=combined.charAt(random.nextInt(combined.length()));
}
System.out.println(password);
    }
}