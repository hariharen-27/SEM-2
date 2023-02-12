import java.util.Scanner; 	
class Area{
public static void main(String[] args){
float pi,area,volume,radius,length;
pi=3.14f;
Scanner obj1=new Scanner(System.in);
Scanner obj2=new Scanner(System.in);
System.out.println("Enter the radius");
radius=obj1.nextFloat();
System.out.println("Enter the length");
length=obj2.nextFloat();


area=radius*radius*pi;
volume=area*length;
System.out.println("area is"+area);
System.out.println("volume is"+volume);


}
}