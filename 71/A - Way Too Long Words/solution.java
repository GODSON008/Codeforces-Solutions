import java.util.Scanner;
 
public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        StringBuilder result = new StringBuilder();
 
        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            if (word.length() > 10) {
                int middleCount = word.length() - 2; 
                result.append(word.charAt(0))
                      .append(middleCount)
                      .append(word.charAt(word.length() - 1));
            } else {
                result.append(word);
            }
            result.append("
");
        }
 
        System.out.print(result);
    }
}