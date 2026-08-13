import java.util.*;
class LongestSequence {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0)
            return 0;
        Set<Integer> numbers = new HashSet<>();
        for(int num : nums)
        {
            numbers.add(num);
        }
        List<Integer> list = new ArrayList<>(numbers);
        Collections.sort(list);

        int longest =1;
        int current =1;
        
        for(int i=1; i<list.size(); i++)
        {
            if(list.get(i) == list.get(i-1) +1)
                current++;
            else
                current = 1;
        longest = Math.max(longest, current);
}
        return longest;
    }

    public static void main(String[] args) {
        int[] nums =  {2,20,4,10,3,4,5};

        LongestSequence l = new LongestSequence();
        System.out.println(l.longestConsecutive(nums));
    }
}