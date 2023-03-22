package userRegistration;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
    public class UC6_EmailValidation {
        public static void Email(String email){
            String regex = ("[^.]{1}[a-c01+.-]{3,7}+@[a-z.,1]{5,13}+[^.]{1}");
            Pattern newpat = Pattern.compile(regex);
            Matcher newmat = newpat.matcher(email);
            Boolean bool = newmat.matches();
            System.out.println(bool);
        }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the email");
            String email = scanner.next();
            UC6_EmailValidation.Email(email);
        }
}
