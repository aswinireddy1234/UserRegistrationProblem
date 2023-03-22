package userRegistration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class UC5_Password {
    public void userPassword(){
        Pattern newpat = Pattern.compile("[A-Z]{1}[a-z]{3}[@][0-9]{2}");
        Matcher newmat = newpat.matcher("Ashu@04");
        Boolean bool = newmat.matches();
        System.out.println(bool);
    }
    public static void main(String[] args) {
        UC5_Password password = new UC5_Password();
        password.userPassword();
    }
}
