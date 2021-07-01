package sdth;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberEx {
    private static Pattern pattern;
    private static Matcher matcher;

    private static final String PHONE_REGEX = "^[(][0-9]{2}[)][-][(][0][0-9]{9}[)]$";

    public PhoneNumberEx(){
        pattern = Pattern.compile(PHONE_REGEX);
    }

    public boolean validate( String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

}
