class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for( String word : strs){
        char[] chars = word.toCharArray();
        CharArray();
        Arrays.sort(chars);
        String key = new String(chars);
        
        if(!map.containsKey(key)){
            List<String> list = new ArrayList<>();
            list.add(word);
            map.put(key, list);
        
        }
        else{
            List<String> list = map.get(key);
            list.add(word);
        }
        }

        return new ArrayList<>(map.values());
    }
}
