package JUnit_Testing;

public class MinMax {
    public int min(int[] arr)
    {
        int Min=arr[0];
        int max=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<Min)
            {
                Min=arr[i];
            }
        }
        return Min;
    }
    public int max(int[] arr)
    {
        int Max=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>Max)
            {
                Max=arr[i];
            }
        }
        return Max;
    }
}
