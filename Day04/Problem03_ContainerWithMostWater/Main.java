package Day04.Problem03_ContainerWithMostWater;

public class Main {

    public static void main(String[] args)
    {
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxWater(height));
    }


    public static int maxWater(int[] height)
{
    int left = 0;
    int right = height.length - 1;
    int maximum = 0;

    while(left < right)
    {
        int width = right - left;
        int currentHeight = Math.min(height[left], height[right]);
        int area = width * currentHeight;

        maximum = Math.max(maximum, area);

        if(height[left] < height[right])
        {
            left++;
        }
        else
        {
            right--;
        }
    }

    return maximum;

    
}


}