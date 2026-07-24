import java.util.Scanner;
 
public class Main {
    
    public static void solve(Scanner scanner) {
        int n = scanner.nextInt();
        int sm = 0;
        
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            sm += x;
        }
        
        // Check if the absolute sum is divisible by 4
        if (Math.abs(sm) % 4 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        if (scanner.hasNextInt()) {
            int t = scanner.nextInt();
            while (t-- > 0) {
                solve(scanner);
            }
        }
        
        scanner.close();
    }
}