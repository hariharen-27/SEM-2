import java.util.*;

public class passwordGenerator {
    public static void main(String[] args){
        String password;
        
        System.out.println("Enter the password");
        Scanner input = new Scanner(System.in);
        password=input.nextLine();
               
        String capitalLetter="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String smallLetter="abcdefghijklmnopqrstuvwxyz";
        String specialCharacter="<>?:|}{[]';/,.!#$%^&*()+-=";
        if(password.length()>=8){
            for(int i=0;i<password.length();i++){
                System.out.println(password[i]);

            }


        }
        else{
            System.out.println("Enter atleast 8 character for password");
        }

    }
}
