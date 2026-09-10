public class WaterContainerBruteForce {
    public static int maxArea(int[] heights) {
      
        int max = 0;
        for(int i=0; i<heights.length-1; i++){
            for(int j=i+1; j<heights.length; j++){

                int area = (j-i) * Math.min(heights[i], heights[j]);
                max = Math.max(area, max);
                
            }
        }
        return max;
    }

    public static void main(String[] args){
        int[] heights = {2,2,2};
        int result = maxArea(heights);
        System.out.println(result);
    }
}
