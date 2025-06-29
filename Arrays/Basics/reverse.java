class reverse
{
public static int[] reverse(int[] arr) 
{
        int size = arr.length;

        for (int i = 0; i < size / 2; i++) 
        {
            int last = size - 1 - i;
            int temp = arr[i];
            arr[i] = arr[last];
            arr[last] = temp;
        }

        return arr;
    }

    public static void main(String[] args) 
    {
        System.out.println("");
        int[] arrys = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] reversed = reverse(arrys);

        for (int i = 0; i < reversed.length; i++) 
        {
            System.out.print(reversed[i]+" ");
        }
    }
}