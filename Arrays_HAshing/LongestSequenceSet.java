import java.util.*;
class LongestSequence {
    public int longestConsecutive(int[] nums) {
        
        if (nums.length == 0)
            return 0;
        Set<Integer> numbers = new HashSet<>();
        for (int num : nums) {
            numbers.add(num);
        }
        int longest = 0;
        for(int num : nums)
        {
            if(!numbers.contains(num -1))
            {
                
                int current = 1;
                int next = num + 1;

                while (numbers.contains(next)) {
                    current++;
                    next++;
                }

                longest = Math.max(longest, current);
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        int[] nums =  {2,20,4,10,3,4,5};

        LongestSequence l = new LongestSequence();
        System.out.println(l.longestConsecutive(nums));
    }
}