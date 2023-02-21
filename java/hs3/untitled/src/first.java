import java.util.*;
public class first {
    public static void main(String[] args){
        int n,p,i;
        Scanner input=new Scanner(System.in);
        System.out.println("enter n");
        n=input.nextInt();
        int arr[]=new int[n];
        System.out.println("enter array elements");

        for(i=0;i<n;i++){
            arr[i]= input.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Enter key");
        p=input.nextInt();
        System.out.println("the desired element is  " + arr[p-1]);
    }
}
