/* 7. 	Create a function that returns true when x is equal to y; otherwise return false.
	isSameNum(4, 8) ➞ false
	isSameNum(2, 2) ➞  true
	isSameNum(42, 32) ➞  false
*/
import java.util.*;
class q7{
    void isSameNum(int f,int s){
        if(f == s){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
    public static void main(String args[]){
        int val1,val2;
        System.out.println("Enter first value:");
        Scanner sc = new Scanner(System.in);
        val1 = sc.nextInt();
        System.out.println("Enter second value");
        val2 = sc.nextInt();
        q7 res = new q7();
        res.isSameNum(val1,val2);
    }
}