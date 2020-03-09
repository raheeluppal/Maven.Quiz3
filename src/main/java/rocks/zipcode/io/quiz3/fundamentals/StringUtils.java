package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        StringBuilder sb = new StringBuilder(str);
            sb.setCharAt(indexToCapitalize, Character.toUpperCase(sb.charAt(indexToCapitalize)));
            return sb.toString();
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        if(baseString.indexOf(indexOfString) == characterToCheckFor){
            return true;
        }
        return false;
    }

    public static String[] getAllSubStrings(String string) {
        int ctr = 0;
        String[] result = new String[getNumberOfSubStrings(string)];
        for (int len = 1; len <= string.length(); len++) {
            for (int i = 0; i <= string.length() - len; i++) {
                int j = i + len - 1;
                for (int k = i; k <= j; k++) {
                    result[ctr] = String.valueOf(string.indexOf(k));
                    ctr ++;
                }
            }
        }
        return result;
    }

    public static Integer getNumberOfSubStrings(String input){
        int n = input.length();
        return (n * (n + 1) / 2) - 1 ;
    }
}
