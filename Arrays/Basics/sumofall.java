public class sumofall 
{
    public static int sum(int[] arr)
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        return sum;
    }
    public static void main(String[] args) 
    {
        System.out.println(" ");
        int[] arr = {1,2,3,4,5,6};
        int res = sum(arr);
        System.out.println(res);
    }
}
