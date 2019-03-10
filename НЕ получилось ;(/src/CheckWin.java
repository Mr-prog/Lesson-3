import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckWin {
    public static Matcher checkWithRegExp(String userNameString) {
        Pattern num = Pattern.compile("^\\d$");
        Matcher m1 = num.matcher(userNameString);



        while (userNameString.length() < 20 || userNameString.length() > 8) {

            Pattern special = Pattern.compile("^\\\\W$");
            Matcher m2 = special.matcher(userNameString);
            return m2;
        }
        return false;
    }
}