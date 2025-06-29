
import java.io.IOException;

public class palindrome
{
    public static boolean palindrome_arr(int[] arr)
    {
        boolean isPalidrome = true;
        int size = arr.length;

        for(int i=0;i<size/2;i++)
        {
            int last = size-1-i;
            if(arr[i]!= arr[last])
            {
                isPalidrome = false;
                break;
            }
        }
        return isPalidrome;
    }

    public static void main(String[] args) throws IOException
    {
        System.out.println("");
        int[] arr= {1,2,3,3,2,1};
       boolean result=  palindrome_arr(arr);
       System.out.println(result);
    }
}
