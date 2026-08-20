import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        String s = sc.next().toLowerCase();
 
        String vowels = "aeiouy";
 
        for (char c : s.toCharArray()) {
            if (!vowels.contains(String.valueOf(c))) {
                System.out.print("." + c);
            }
        }
    }
}