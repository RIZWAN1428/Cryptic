import java.util.HashMap;
import java.util.Map;

public class AnagramMap {
    public boolean isAnagram(String s, String t){
        Map<Character, Integer> scount = new HashMap<>();
        Map<Character, Integer> tcount = new HashMap<>();

        if(s.length() != t.length())
            return false;

        for(char c : s.toCharArray())
        {
            if(!scount.containsKey(c))
            {
                scount.put(c,1);
            }
            else{
                scount.put(c, scount.get(c)+1);
            }
        }

        for(char c : t.toCharArray()){
            if(!tcount.containsKey(c))
            {
                tcount.put(c, 1);
            }
            else{
                tcount.put(c, tcount.get(c)+1);
            }
        }

        return scount.equals(tcount);
    }

    public static void main(String args[])
    {
        String a = "jar";
        String b = "jam";
        String c = "raj";

        AnagramMap d = new AnagramMap();
        System.out.println(d.isAnagram(a, c));
    }
}