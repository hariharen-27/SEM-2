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

                        if(hm.get(arr[i])==1){
                            hm.put(arr[i],hm.get(arr[i])+1);

                            count++;
                        }

                        }
                        else{
                            hm.put(arr[i],1);
                        }


        }
System.out.println(count);
        for (Integer key: hm.keySet()){

            System.out.println(hm.get(key));
        }


    }
}
