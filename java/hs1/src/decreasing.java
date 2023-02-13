import java.util.Scanner;

class decreasing{
public static void main(String[] args){
int i=0,n,count=0;

Scanner input=new Scanner(System.in);
System.out.println("Enter the array size");
n=input.nextInt();
int array[]= new int[n];
for(i=0;i<n;i++){
array[i]=input.nextInt();

}
for(i=0;i<n;i++){
if(i!=(n-1) && array[i]>array[i+1]){
count+=1;
}
else if(array[i-1]>array[i]){
count+=1;
}

}
if(count==n){
System.out.println("Decreasing");}
else{
System.out.println("non Decreasing");}
}

}
