package Sorting;

public class selection_sort {

    public static int[] sorted(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            int smallest = i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[smallest]>arr[j])
                {
                    smallest= j;
                }
        }
        int temp = arr[smallest];
        arr[smallest]= arr[i];
        arr[i]= temp;
    }
    return arr;
}

    public static void main(String[] args) {
        System.out.println(" ");
        int[] arr= {2,4,5,8,9,1};
        int[] arred= sorted(arr);
        for(int n:arred)
        {
            System.out.print(n+" ");
        }
    }
}
