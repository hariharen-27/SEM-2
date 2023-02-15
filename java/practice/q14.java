/*14. Create a function that finds the maximum range of a triangle's third edge, where the side lengths are all integers.
	nextEdge(8, 10) ➞ 17
	nextEdge(5, 7) ➞ 11
	nextEdge(9, 2) ➞ 10
Notes
	(side1 + side2) - 1 = maximum range of third edge.
    	The side lengths of the triangle are positive integers.
 */

import java.util.*;
class q14{
    int edge3;
    void nextedge(int e1,int e2){
        edge3 = (e1 + e2) -1; 
        System.out.println("Maximum range of third edge:"+edge3);
    }
    public static void main(String args[]){
        int edge1,edge2;
        System.out.println("Enter first edge of triangle");
        Scanner sc = new Scanner(System.in);
        edge1 = sc.nextInt();
        System.out.println("Enter second edge of triangle");
        edge2 = sc.nextInt();
        q14 res = new q14();
        res.nextedge(edge1,edge2); 
    }
}