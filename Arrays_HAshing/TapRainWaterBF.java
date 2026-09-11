public class TapRainWaterBF {
    public static int trap(int[] height) {
        
        int collect = 0;
        for(int i=1; i<height.length-1;i++)
        {
            int leftMax = height[i-1];
            for(int j=i-1; j>=0; j--)
            {
                leftMax = Math.max(leftMax, height[j]);
            }
            
       
            int rightMax = height[i+1];
            for(int j=i+1; j< height.length; j++)
            {
                rightMax = Math.max(rightMax, height[j]);
            }
            
        int water = Math.max(0,Math.min(leftMax, rightMax) - height[i]);
        collect += water;
        }

        return collect;
    }

    public static void main(String[] args) {
        int[] heights = {0,2,0,3,1,0,1,3,2,1};
        int result = trap(heights);
        System.out.print(result);
    }
}
