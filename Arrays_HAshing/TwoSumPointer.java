import java.util.Arrays;

public class TwoSumPointer{
public int[] twoSum(int[] numbers, int target) {
        
        int left= 0;
        int right = numbers.length-1;

        while(left<right)
        {
        int sum = numbers[left] + numbers[right];
        if(sum>target)
            right--;
        else if(sum < target)
            left++;
        else
            return new int[]{left+1, right+1};
        }

        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int[] num = {1,2,3,4};
        int target = 4;

        TwoSumPointer tsp = new TwoSumPointer();
        int[] result = tsp.twoSum(num, target);
        System.out.println(Arrays.toString(result));  
    }
}