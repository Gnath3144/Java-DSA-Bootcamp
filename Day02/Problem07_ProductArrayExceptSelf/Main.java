public class Main {

    public static void main(String[] args) {

        int arr[] = {1,2,3,4};

    }

    int ans[] = product(arr);

for(int value : ans)
{
    System.out.print(value+" ");
}

}

public static int[] product(int arr[])
{
    int result[] = new int[arr.length];

    for(int i=0;i<arr.length;i++)
    {
        int product = 1;

        for(int j=0;j<arr.length;j++)
        {
            if(i!=j)
            {
                product *= arr[j];
            }
        }

        result[i]=product;
    }

    return result;
}