import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordStrengthChecker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter password: ");
        String password = input.nextLine();

        int score = 0;


        if (password.length() >= 8 && password.length() <= 15) {
            score++;
        }


        Pattern pattern = Pattern.compile("[a-z]");
        Matcher matcher = pattern.matcher(password);
        if (matcher.find()) {
            score++;
        }

    
        pattern = Pattern.compile("[A-Z]");
        matcher = pattern.matcher(password);
        if (matcher.find()) {
            score++;
        }

    
        pattern = Pattern.compile("[0-9]");
        matcher = pattern.matcher(password);
        if (matcher.find()) {
            score++;
        }

    
        pattern = Pattern.compile("[^a-zA-Z0-9]");
        matcher = pattern.matcher(password);
        if (matcher.find()) {
            score++;
        }


        System.out.println("Password strength score: " + score + "/5");

    }

}