package Sorting;
public class bubble_sort {

    public static int[] sorted(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=0;j<arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) 
    {
        System.out.println(" ");
        int[] arr= {2,3,4,1,5,6};
        int[] arred= sorted(arr);
        for(int n: arred)
        {
            System.out.print(n+" ");
        }
    }

    
}
