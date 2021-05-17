import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

import static org.apache.commons.lang3.StringUtils.isNumeric;
import static org.apache.commons.lang3.StringUtils.swapCase;

public class MavenExercise1 {

    public static String userInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input anything!");
        return sc.nextLine();
    }

    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        String input = userInput();
//        String input = sc.next();
//        System.out.println("isNumeric(userInput()) = " + isNumericMethod(input));

        String input = userInput();

        if (isNumeric(input)) {
            System.out.println("Congrats, your input was a number!");
        } else {
            System.out.println("Congrats, your input was NOT a number!");
        }

        System.out.printf("Here's your input but it is now the opposite casing of how it was inputted: %s\n", StringUtils.swapCase(input));

        System.out.printf("Here's your input but reversed: %s\n", StringUtils.reverse(input));
    }
}
