import java.util.*;
import java.io.*;
 
public class A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
 
        while (t-- > 0) {
            String n = br.readLine().trim();
            int len = n.length();
            List<String> parts = new ArrayList<>();
 
            for (int i = 0; i < len; i++) {
                char c = n.charAt(i);
                if (c != '0') {
                    StringBuilder num = new StringBuilder();
                    num.append(c);
                    // append zeros for the remaining positions to the right
                    for (int j = i + 1; j < len; j++) {
                        num.append('0');
                    }
                    parts.add(num.toString());
                }
            }
 
            sb.append(parts.size()).append('
');
            sb.append(String.join(" ", parts)).append('
');
        }
 
        System.out.print(sb);
    }
}