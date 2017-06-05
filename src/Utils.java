import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Utils {
    static boolean validateEmail(String email) {
        String ePattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
        Pattern pattern = Pattern.compile(ePattern);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    static String joinStringArray(String[] array, String delimiter) {
        StringBuilder result = new StringBuilder(array[0]);
        for(int i = 1; i < array.length; i++) {
            result.append(delimiter);
            result.append(array[i]);
        }
        return result.toString();
    }
}
