import java.util.*;
public class search {
    public static void main(String args[])
    {
        int i, j, temp= 0;
        int a[]={5, 12, 14, 6, 78, 19, 1, 23, 26, 35, 37, 7, 52, 86, 47};
        int n=a.length;
        for (i=0; i<n; i++)
        {
            for (j=0; j<n; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println("The elements in array after sorting");
        for (i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
}
