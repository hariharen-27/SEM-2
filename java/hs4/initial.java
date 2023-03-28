import java.util.Scanner;

public class initial{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter full name: ");
        String fullName = reader.nextLine();

        System.out.print(getFirstName(fullName). + " "+getInitials(fullName).toUpperCase());
    }

    public static String getFirstName(String fullName) {
        return fullName.substring(0, fullName.indexOf(' '));
    }

    public static String getInitials(String fullName) {
        int idxLastWhitespace = fullName.lastIndexOf(' ');
        return fullName.substring(idxLastWhitespace + 1, idxLastWhitespace + 2);
    }
}

//variable.lastindex('letter')
//variable.toUppercase()
//
