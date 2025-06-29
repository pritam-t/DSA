package Sorting;

public class insertion_sort 
{
    public static int[] sorted(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            int sorted_part = arr[i];
            int j=i-1;
            while(j>=0 && sorted_part< arr[j])
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1] = sorted_part;
        }
        return arr;
    }

    public static void main(String[] args) 
    {
        System.out.println(" ");
        int[] arr ={9,8,7,6,5,4,3,2,1};
        for(int n:sorted(arr))
        {
            System.out.print(n+" ");
        }
    }
    
}
