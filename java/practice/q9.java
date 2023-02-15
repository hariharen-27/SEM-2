/* 9. 	Create a function that takes length and width and finds the perimeter of a rectangle.
	findPerimeter(6, 7) ➞ 26
	findPerimeter(20, 10) ➞ 60
	findPerimeter(2, 9) ➞ 22
*/
import java.util.*;
class q9{
    int perimeter;
    void findPerimeter(int l,int w){
        perimeter=2*(l+w);
        System.out.println("Minutes to seconds convertion is:"+perimeter);
    }
    public static void main(String args[]){
        int length,width;
        System.out.println("Enter length of rectangle:");
        Scanner sc = new Scanner(System.in);
        length = sc.nextInt();
        System.out.println("Enter width of rectangle:");
        width = sc.nextInt();
        q9 res = new q9();
        res.findPerimeter(length,width);
    }
}