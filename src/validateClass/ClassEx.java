package validateClass;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassEx {
    private static Pattern pattern;
    private static Matcher matcher;

    private static final String CLASSS_REGEX = "^[ACP]{1}[{0-9]{4}[GHIKLM]{1}$";

    public ClassEx(){
        pattern = Pattern.compile(CLASSS_REGEX);
    }

    public boolean validate( String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
