package password;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordExample {

    private static final String REGEX_PASSWORD = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{10,}$";

    public static void example() {
        System.out.println("---- Nhap mat khau -----");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.length() < 10) {
            System.out.println("Mat khau yeu");
        } else if (!input.matches(REGEX_PASSWORD)) {
            System.out.println("Mat khau chua du manh");
        } else {
            System.out.println("Success");
        }
    }
}

