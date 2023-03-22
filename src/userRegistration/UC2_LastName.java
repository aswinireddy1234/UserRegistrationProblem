package userRegistration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
    public class UC2_LastName {
        public void lastName(){
            Pattern newpat = Pattern.compile("[A-Za-z]{3,}");
            Matcher newmat = newpat.matcher("Reddy");
            Boolean bool = newmat.matches();
            System.out.println(bool);
        }

        public static void main(String[] args) {
            UC2_LastName lastName = new UC2_LastName();
            lastName.lastName();

        }
}
