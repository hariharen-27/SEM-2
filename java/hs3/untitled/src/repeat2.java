import java.util.*;
public class repeat2 {
    public static void main(String[] args){
        int i,j,n,count=0;
        ArrayList<Integer>arr2= new ArrayList<Integer>();
        Scanner input=new Scanner(System.in);
        System.out.println("enter the array sizes");
        n=input.nextInt();
        HashMap<Integer,Integer> hm =new HashMap<>();
        int [] arr=new int[n];
        for ( i = 0; i < n; i++) {
            arr[i]=input.nextInt();

        }
        for ( i = 0; i < n; i++) {
            if(hm.containsKey(arr[i])){
                hm.put(arr[i],hm.get(arr[i])+1);
                        if(hm.get(arr[i])==2){
                            arr2.add(arr[i]);
                            count++;
                        }
                        else if(hm.get(arr[i])>2){

                        }
                        }
                        else{
                            hm.put(arr[i],1);
                        }


        }
System.out.println(count);
        for(int a:arr2) {
            System.out.print(a+" ");
        }


    }
}
