import java.util.*;
public class studentHeights {
    public static void main(String[] args){
        int n,i,j,count=1;
        float avg;

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of students");
        n=sc.nextInt();
        int array[]=new int[n];
        System.out.println("enter the students height");
        for(i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        Arrays.sort(array);
        System.out.println("height   count");


        for(i=0;i<n;i++){

            for(j=i+1;j<n;j++){


                
                if(j==n-1){
                    if(array[i]==array[j]){
                        count+=1;
                        System.out.println(array[i]+"     "+count);
                    }
                    else{
                        
                        System.out.println(array[i]+"     "+count);
						count=1;
					    System.out.println(array[j]+"     "+count);
						i=n;
						
                    }
                }
				else if(array[j]==array[i]){
                    	count+=1;


                }
                else{
                    System.out.println(array[i]+"     "+count);
                    count=1;
                    i=j;


                }
            }
        }

    }
}