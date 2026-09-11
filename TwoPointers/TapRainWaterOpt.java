public class TapRainWaterOpt {
    public static int trap(int[] height) {
        int left = 0;
        int right = height.length-1;

        int leftMax = 0;
        int rightMax = 0;

        int collect = 0;

        while (left < right) {

            leftMax = Math.max(leftMax, height[left]);
            rightMax = Math.max(rightMax, height[right]);
            if(height[left] < height[right]) {
                collect += leftMax - height[left];
                left++;
            }
            else{
                collect += rightMax - height[right];
                right--;
            }
            
        }

        return collect;
    }

    public static void main(String[] args) {
        int[] heights = {0,2,0,3,1,0,1,3,2,1};
        int result = trap(heights);
        System.out.print(result);
    }
}
