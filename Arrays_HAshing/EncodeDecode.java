import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EncodeDecode {
    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for (String str : strs)
        {
            sb.append(str.length()).append("#").append(str);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result =  new ArrayList<>();

        int i=0;
        while (i < str.length()) {
            int j = str.indexOf('#', i);

            int length = Integer.parseInt(str.substring(i,j));
            int start = j+1;

            String word = str.substring(start, start+length);
            result.add(word);
            i = start + length;
        }

        return result;
    }

    public static void main(String[] args) {
        List<String> strs = Arrays.asList("Hello", "world", "Hi");

        EncodeDecode ed = new EncodeDecode();

        String encoded = ed.encode(strs);
        System.out.println("Encoded: " + encoded);

        List<String> decoded = ed.decode(encoded);
        System.out.println("Decoded: " + decoded);
    }
}
