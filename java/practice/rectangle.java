import java.util.Scanner;
public class rectangle {
    public static void main(String[] args){
        int length,width;
        Scanner val=new Scanner(System.in);
        System.out.println("Enter length");
        length=val.nextInt();
        System.out.println("Enter width");
        width=val.nextInt();


        findPerimeter(length,width);
    }
    static void findPerimeter(int a,int b){
        int perimeter;
        perimeter=2*(a+b);
        System.out.println(perimeter);
    }
}
