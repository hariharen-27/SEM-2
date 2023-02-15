/*6.Create a method that takes two integers as arguments and return their sum.
	SumOfTwoNumbers(3, 2) ➞ 5
	SumOfTwoNumbers(-3, -6) ➞ -9
	SumOfTwoNumbers(7, 3) ➞ 10
 */

import java.util.*;
class q6{

    static void sum(int f,int s){
        int sum;
        sum = f+s;
        System.out.println("Sum of Two Numbers:"+sum);
    }
    public static void main(String args[]){
        int val1,val2;
        System.out.println("Enter first value:");
        Scanner sc = new Scanner(System.in);
        val1 = sc.nextInt();
        System.out.println("Enter second value");
        val2 = sc.nextInt();
        q6 res = new q6();
        sum(val1,val2);
    }
}