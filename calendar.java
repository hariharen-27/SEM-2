import java.util.*;
public class calendar {
    public static void main(String[] args){
        int n,i,j,count=1;
        float avg;
        int array[]=new int[100];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of students");
        n=sc.nextInt();
        System.out.println("enter the students height");
        for(i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        Arrays.sort(array);
        System.out.println("sorted");
        for(i=0;i<n;i++){
            System.out.println("entered loop");
            count=1;
            for(j=i+1;j<n;j++){
                System.out.println("entered loop 2");
                if(array[i]==array[j]){
                    count+=1;
                    System.out.println("continued");
                    
                }
                else{
                    System.out.println(array[i]+"   "+count);
                    i=j;
                }
            }
        }

    }
}
