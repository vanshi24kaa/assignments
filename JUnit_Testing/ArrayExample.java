package JUnit_Testing;

public class ArrayExample {
    public int[] arrA(int[] arr)
    {
        int min=arr[0];
        int max=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
            else if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        int a[]={min,max};
        return a;
    }
}
