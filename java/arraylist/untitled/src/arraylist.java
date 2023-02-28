import java.util.*;
public class arraylist {
    public static void main(String[] args){
        ArrayList<String> str1=new ArrayList<String>();
        ArrayList<String> str2=new ArrayList<String>();
        int i=0;
        String in;
        Scanner input=new Scanner(System.in);
        boolean bool=true;
        System.out.println("enter the name of students");
        while(bool){
            in=input.next();
            if(in.equals("quit"))
                break;
            else
                str1.add(in);
        }
        for(String s:str1){
            if(str2.contains(s)){
                continue;
            }
            else {
                str2.add(s);
            }
        }
        for(String s:str2){
            System.out.println(s);

        }
        Random rand=new Random();
        System.out.println("The winner is "+str2.get(rand.nextInt(str2.size())));
    }
}
