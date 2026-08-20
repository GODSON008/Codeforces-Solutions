import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int k = sc.nextInt(); // cost of first banana
        int n = sc.nextInt(); // money he has
        int w = sc.nextInt(); // number of bananas
 
        int total = 0;
 
        for (int i = 1; i <= w; i++) {
            total += i * k;
        }
 
        if (total > n) {
            System.out.println(total - n);
        } else {
            System.out.println(0);
        }
    }
}