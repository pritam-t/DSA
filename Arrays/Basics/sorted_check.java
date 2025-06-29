public class sorted_check {
    public static boolean Sorted(int[] arr)
    {
        int i = 0;
        boolean isSorted = true;
        for(int j= 1+i ; j<arr.length; j++)
        {
            if(arr[i]>arr[j])
            {
                isSorted = false;
                break;
            }
            i++;
        }
        return isSorted;
    }
    
    public static void main(String[] args)
     {
        System.out.println(" ");
        int[] arr= {1,2,3,1,4,5,6};
        String sortedd= (Sorted(arr) == true)? "Is Sorted": "Not sorted";
        System.out.println(sortedd);

    }
}
