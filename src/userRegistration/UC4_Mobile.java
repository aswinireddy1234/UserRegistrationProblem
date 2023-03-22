package userRegistration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UC4_Mobile {
    public void mobilenumber(){
        Pattern newpat = Pattern.compile("[91]{2}\\s[0-9]{10}");
        Matcher newmat = newpat.matcher("91 6303632499");
        Boolean bool = newmat.matches();
        System.out.println(bool);

    }
    public static void main(String[] args) {
        UC4_Mobile mobileNumber = new UC4_Mobile();
        mobileNumber.mobilenumber();
    }
}
