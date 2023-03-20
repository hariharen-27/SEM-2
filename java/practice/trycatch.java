import java.util.*;
public class trycatch{
    public static void main(String args[]){
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number of elements in the array: ");
        n=sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter array elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
    }
}