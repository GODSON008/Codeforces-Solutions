import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int targetRow = 0;
        int targetCol = 0;
 
        
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (scanner.nextInt() == 1) {
                    targetRow = i;
                    targetCol = j;
                }
            }
        }
        scanner.close();
 
       
        int moves = Math.abs(targetRow - 3) + Math.abs(targetCol - 3);
 
        System.out.println(moves);
    }
}