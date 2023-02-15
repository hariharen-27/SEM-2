import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        float n,area,volume,length=0,radius=0;
        Scanner val=new Scanner(System.in);
        System.out.println("Enter The radius value:");
        radius= val.nextInt();
        Scanner p=new Scanner(System.in);
        System.out.println("Enter The length value:");
        length= p.nextInt();
        area=radius*radius*22/7;
        System.out.println("The Area is :"+area);
        volume=area*length;
        System.out.println("The Volume is:"+volume);
    }
}
