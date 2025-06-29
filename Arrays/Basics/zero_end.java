public class zero_end {

    public static int[] positions(int[] arr)
    {
        int last =(arr.length)-1;
        for(int i=0;i<=last; i++)
        {
            while(arr[i] == 0 && i<last)
            {
                int temp = arr[i];
                arr[i] = arr[last];
                arr[last]= temp;
                last--;
            }
        }
        return arr;
    }

    public static void main(String[] args) 
    {
        System.out.println(" ");
        int[] arr = {0,2,0,0,3,0,2,1};
        int [] newsest = positions(arr);

        for(int n :newsest)
        {
            System.out.print(n+" ");
        }
        
    }
}
