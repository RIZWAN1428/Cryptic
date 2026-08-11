import java.util.Arrays;

class ProductExceptSelf{
    public int[] product(int[] nums)
    {   
        int[] output = new int[nums.length];

        for(int i=0; i<nums.length; i++)
        {
            int product =1;

            for(int j=0; j<nums.length; j++)
            {
                if (i != j)
                {
                    product *= nums[j];
                }
            }

            output[i] = product;
        }
    return output;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,6,8};

        ProductExceptSelf p = new ProductExceptSelf();
        int[] result = p.product(nums);
        System.out.println(Arrays.toString(result));
    }
}