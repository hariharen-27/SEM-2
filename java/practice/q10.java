/*10. Create a function that takes voltage and current and returns the calculated power.
	power(230, 10) ➞ 2300
	power(110, 3) ➞ 330
	power(480, 20) ➞ 9600
 */
import java.util.*;
class q10{
    int power;
    void power(int v,int c){
        power=v*c;
        System.out.println("Minutes to seconds convertion is:"+power);
    }
    public static void main(String args[]){
        int voltage,current;
        System.out.println("Enter voltage:");
        Scanner sc = new Scanner(System.in);
        voltage = sc.nextInt();
        System.out.println("Enter current:");
        current = sc.nextInt();
        q10 res = new q10();
        res.power(voltage,current);
    }
}