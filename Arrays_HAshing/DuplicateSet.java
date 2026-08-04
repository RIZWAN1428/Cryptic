package Arrays_HAshing;
import java.util.HashSet;
import java.util.*;

public class DuplicateSet {
    public boolean hasDuplicate(int[] nums)
    {
        Set<Integer> seen = new HashSet<>();
        for(int num : nums)
        {
            if(seen.contains(num))
                return true;
            seen.add(num);
        }
        return false;
    }
    public static void main(String args[])
    {
        int[] test = {1,2,3,4,5,5};
        DuplicateSet d = new DuplicateSet();
        System.out.println(d.hasDuplicate(test));
    }
}
