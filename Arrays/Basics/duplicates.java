import java.util.HashSet;
import java.util.Set;

public class duplicates 
    {
        public static int[] duplicatee(int[] arr)
        {
            Set<Integer> original = new HashSet<>();
            Set<Integer> duplicate = new HashSet<>();

            for(int num: arr)
            {
             if(!original.add(num))
             {
                duplicate.add(num);
             }
            }

            int[] result = new int[duplicate.size()];
            int i =0;
            for(int num: duplicate)
            {
                result[i++] = num;
            }
            return result;
        }
    public static void main(String[] args)
    {
        System.out.println(" ");
        int[] arr={1,2,3,4,5,3,6,3,2};
        int[] dupli = duplicatee(arr);
        for(int i=0;i<dupli.length;i++)
        {
            System.out.println(dupli[i]);
         }
    }
    
}
