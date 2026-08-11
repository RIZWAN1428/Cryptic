import java.util.Arrays;

class ProductExceptSelfOpt{
    public int[] product(int[] nums)
    {   
        int[] output = new int[nums.length];

        int prefix = 1;
        for(int i=0; i<nums.length; i++)
        {
            output[i] = prefix;
            prefix *= nums[i];
        }
        int suffix = 1;
        for(int i=nums.length - 1; i>=0; i--)
        {
            output[i] *= suffix;
            suffix *= nums[i];
        }
    return output;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,6,8};

        ProductExceptSelfOpt p = new ProductExceptSelfOpt();
        int[] result = p.product(nums);
        System.out.println(Arrays.toString(result));
    }
}