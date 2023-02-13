import java.util.*;
public class prob4 {
    public static void weight(int feet,int inches,String gender){
        int weight;
        weight=0;
        if(gender.equals("female")){
            if(feet==5 && inches==0){
                weight=100;
            }
            else
            {
                weight=100+( (feet-5)* 12 * 6) + ( 6 * inches );
            }
        }
        else if(gender.equals("male")){
            if(feet==5 && inches==0){
                weight=106;
            }
            else
            {
                weight=106+(( feet-5)*12*7)+(7*inches);
            }
        }
        else{
            System.out.println("Invlid");
        }
        System.out.println("Number of feet :"+ feet);
        System.out.println("Number of inches:"+ inches);
        System.out.println("You should weigh " + weight + " pounds");
    }
    public static void main(String[] args){
        int feet,inches;
        String gender;
        Scanner s=new Scanner(System.in);
 	  System.out.println("Enter the gender:");
        gender=s.next();
        System.out.println("Enter the feet:");
        feet=s.nextInt();
        System.out.println("Enter the inches:");
        inches=s.nextInt();
       
        weight(feet,inches,gender);
    }
}
