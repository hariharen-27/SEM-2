/* 11. Create a function that takes a number as an argument, increments the number by +1 and returns the result.
	addition(0) ➞ 1
	addition(9) ➞ 10
	addition(-3) ➞ -2
*/

import java.util.*;
class q11{
    void addition(int add){
        add +=1;
        System.out.println("Hours to seconds convertion is:"+add);
    }
    public static void main(String args[]){
        int val;
        System.out.println("Enter value to increment by 1:");
        Scanner sc = new Scanner(System.in);
        val = sc.nextInt();
        q11 res = new q11();
        res.addition(val);
    }
}