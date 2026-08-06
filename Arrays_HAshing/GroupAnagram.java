import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for(String word : strs)
        {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);

            if(!map.containsKey(key))
            {
                List<String> list = new ArrayList<>();
                list.add(word);     
                map.put(key, list);
            }
            else
            {
                List<String> list = map.get(key);
                list.add(word);
            }
        }
        return new ArrayList<>(map.values());   
    }

    public static void main(String[] args)
    {
        String[] strs = {"act","pots","tops","cat","stop","hat"};
        Solution s = new Solution();
        List<List<String>>  result = s.groupAnagrams(strs);
        System.out.println(result);
    }
}
