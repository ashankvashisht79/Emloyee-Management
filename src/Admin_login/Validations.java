/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin_login;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author DEEPAK
 */
public class Validations {

    private Pattern email;
    private Pattern name;
    private Matcher matcher;
    private Pattern phone;
    private Pattern salary;
    private Pattern overtimepay;
    private static final String NAME_PATTERN="^[A-Za-z]{3,25}$";
    private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,3})$";
    private static final String PHONE_PATTERN="[0-9]{10}$";
    private static final String SALARY_PATTERN="[0-9]{3,6}$";
      private static final String OVERTIME_PATTERN="[0-9]{2,5}$";
    public Validations()
    {
        email = Pattern.compile(EMAIL_PATTERN);
        name = Pattern.compile(NAME_PATTERN);
        phone=Pattern.compile(PHONE_PATTERN);
        salary=Pattern.compile(SALARY_PATTERN);
        overtimepay=Pattern.compile(OVERTIME_PATTERN);
    }

    /**
     * Validate hex with regular expression
     *
     * @param hex hex for validation
     * @return true valid hex, false invalid hex
     */
    public boolean email_validate(final String hex) {

        matcher = email.matcher(hex);
        return matcher.matches();

    }
    public boolean overtimepay_validate(final String hex) {

        matcher = overtimepay.matcher(hex);
        return matcher.matches();

    }
     public boolean salary_validate(final String hex) {

        matcher = salary.matcher(hex);
        return matcher.matches();

    }
    public boolean phone_validate(final String hex) {

        matcher = phone.matcher(hex);
        return matcher.matches();

    }
    
    public boolean name_validate(final String hex) {

        matcher = name.matcher(hex);
        return matcher.matches();

    }
}
