import java.util.*;
public class diagonal {
    public static void main(String[] args){
        int rows,cols,i,j,sum=0;
        Scanner input =new Scanner(System.in);
        System.out.println("enter size of rows and columns");
        rows=input.nextInt();
        cols=input.nextInt();
        System.out.println("enter the array elements");
        int [][]arr=new int[rows][cols];
        for(i=0;i<rows;i++){
            for (j = 0; j < cols; j++) {
                arr[i][j]=input.nextInt();
            }
        }

        for(i=0,j=0;i<rows;i++,j++){

                sum+=arr[i][j];

        }
        System.out.println(sum);



    }
}
