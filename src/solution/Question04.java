package solution;
import java.util.Scanner;

/**
 * @ Author : Rakesh Yadav
 */

public class Question04 {
    public static void main(String[] args) {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.next();

        inputString = inputString.toLowerCase();
        for (int i = 0; i < inputString.length(); i++) {
           if (inputString.charAt(i) == 'a' || inputString.charAt(i)=='e' || inputString.charAt(i)=='o' || inputString.charAt(i)=='u' || inputString.charAt(i)=='i') {
                char replaceChar = inputString.charAt(i);
                count += 1;
                switch (count) {
                    case 1:
                        inputString = inputString.replace(replaceChar, '*');
                        break;
                    case 2:
                        inputString = inputString.replace(replaceChar, '^');
                        break;
                    case 3:
                        inputString = inputString.replace(replaceChar, '!');
                        break;
                    case 4:
                        inputString = inputString.replace(replaceChar, '&');
                        break;
                    case 5:
                        inputString = inputString.replace(replaceChar, '$');
                        break;
                    default:
                        inputString = inputString.replace(replaceChar, '_');
                }
            }
        }
        System.out.println(inputString);
        scanner.close();
    }
}
