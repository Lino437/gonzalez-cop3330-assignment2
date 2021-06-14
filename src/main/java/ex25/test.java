package ex25;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {
    public static void main(String[] args){
        String password = "1337@hxor";

        boolean tf = onlyDigits(password);
        System.out.println(tf);
        tf = isStringOnlyAlphabet(password);
        System.out.println(tf);

    }

    public static boolean onlyDigits(String str)
    {
        String regex = "[0-9]+";
        Pattern p = Pattern.compile(regex);
        if (str == null) {
            return false;
        }
        Matcher m = p.matcher(str);
        return m.matches();
    }


    public static boolean isStringOnlyAlphabet(String str)
    {
        return ((str != null)
                && (!str.equals(""))
                && (str.matches("^[a-zA-Z]*$")));
    }
}
