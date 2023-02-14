import java.util.*;
import java.lang.*;
class weight{
public static void main(String[] args){
int feet,inch,gender,weight=0;
Scanner sc=new Scanner(System.in);
System.out.println("Type 1 if you are female and 2 if male: ");
gender=sc.nextInt();
System.out.println("How tall are you");
System.out.println("number of feet");
feet=sc.nextInt();

System.out.println("number of inch");
inch=sc.nextInt();
if(gender==1){
if(feet>=5 && inch>0){
weight=100+((feet-5)*12*6)+(inch*6);
}
else{
weight=100;
}
}
else if(gender==2){
if(feet>=5 && inch>0){
weight=106+((feet-5)*12*7)+(inch*7);
}
else{
weight=106;
}
}

System.out.println("You should weight "+ weight + "pounds");
}
}