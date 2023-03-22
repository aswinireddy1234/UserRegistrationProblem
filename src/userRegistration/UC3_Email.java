package userRegistration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
    public class UC3_Email {
        public void emailofUser(){
            Pattern newpat = Pattern.compile("[a-c]{3}[.][x-z]{3}[@][a-z]{2}[.][a-z]{2}[.][a-z]{2}");
            Matcher newmat = newpat .matcher("abc.xyz@bl.co.in");
            Boolean bool = newmat.matches();
            System.out.println(bool);
        }

        public static void main(String[] args) {
            UC3_Email useremail = new UC3_Email();
            useremail.emailofUser();
        }
}

