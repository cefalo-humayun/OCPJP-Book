package Localization;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * @author humayun
 */
public class Localization1 {
    public static void main(String args[]) {
        Locale.setDefault(new Locale("fr", "CA"));
        //Set default to French Canada
        Locale l = new Locale("jp", "JP");
        ResourceBundle rb = ResourceBundle.getBundle("appmessages", l);
        String msg = rb.getString("greetings");
        System.out.println(msg);
    }
}
