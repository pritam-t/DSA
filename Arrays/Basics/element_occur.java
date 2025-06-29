
import java.util.HashMap;
import java.util.Map;

public class element_occur 
{

    public static Map<Integer,Integer> occurence(int[] arr)
    {
        Map<Integer,Integer> elements = new HashMap<>();

        for(int i =1;i<=arr.length-1;i++)
        {
            int key= arr[i];
            elements.put(key, elements.getOrDefault(key, 0)+1);
        }
        return elements;

    }

    public static void main(String[] args) 
    {
        System.out.println(" ");
        int[] arr = {1,2,3,4,2,3,1};
        
        Map<Integer,Integer> occur = new HashMap<>(occurence(arr));

        for(int n: occur.keySet())
        {
            System.out.println(n+" : "+occur.get(n));
        }
        
    }
}
