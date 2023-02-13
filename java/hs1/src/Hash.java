import java.util.HashMap;
import java.util.Map;

 class Hash {
    public static void main(String[] args) {
        int arr[] = {23,22,34,23,22,11};
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int idx : arr){
            if(hm.containsKey(idx))
                hm.put(idx, hm.get(idx)+1);
            else
                hm.put(idx,1);
        }
        for(Map.Entry<Integer,Integer> entry : hm.entrySet())
            System.out.println(entry.getKey() + "-" + entry.getValue());

    }
}