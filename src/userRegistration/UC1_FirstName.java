package userRegistration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
 public class UC1_FirstName {

  public void firstName(){
   Pattern newpat = Pattern.compile("[A-Za-z]{6,}");
   Matcher newmat = newpat.matcher("Aswini");
   Boolean bool = newmat.matches();
   System.out.println(bool);
  }

  public static void main(String[] args) {
   UC1_FirstName firstname = new UC1_FirstName();
   firstname.firstName();

  }

 }

