public class merge_two_sorted 
{
    public static int[] merged(int arr1[],int arr2[])
    {
        int size= (arr1.length>arr2.length)? arr1.length: arr2.length ;
        int[] arr3= new int[size-1];
        int pointer = 0;
        for(int i=0;i<size;i++)
        {
            if(arr1[i]<arr2[i])
            {

            while(arr1[i]<arr2[i])
            {
                arr3[pointer]= arr1[i];
                pointer++;
            }

            }
            if(arr1[i]>arr2[i])
            {
            while(arr1[i]>arr2[i])
            {
                arr3[pointer]= arr2[i];
                pointer++;
            }
            }
        }
       return arr3;
    }

    public static void main(String[] args) 
    {
        
        System.out.println(" ");
        int[] arr1= {1,2,3,4,5,6};
        int[] arr2= {7,8,9,10,11,12};

        int[] arr3=merged(arr1, arr2);

        for(int n: arr3)
        {
            System.out.print(n+" ");
        }

    }
    
}
