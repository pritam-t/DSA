public class remove_element 
{

    public static int remove(int[] arr,int val)
    {
        int k =0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=val)
            {
                arr[k]=arr[i];
                k++;
            }
        }
        return k;
    }
    
    public static void main(String[] args) 
    {
        System.out.println(" ");
        int[] arr = {1,2,3,4,5,1};
        int k = remove(arr, 1);
        System.out.println(k);
    }
    
}
