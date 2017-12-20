package com.gp2.outils;

import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;

/**
 * Created by KELANI on 9/13/2017. Package name: Utility Project name:
 * GestionnaireLibrairieEnLigne
 */
public class InputValidator {

    // validate first name, last name from the user
    public static boolean validateName(String userName) {
        if ((userName != null) && (userName.matches("[A-Za-z]+|[A-Za-z]+[[\\s'-][A-Za-z]*]*$"))) {
            return true;
        } else {
            throw new IllegalArgumentException();
        }
    }

    // validate adresse rue from the user
    public static boolean validateAdresseRue(String userAddress) {

        if (userAddress == null || userAddress.isEmpty()) {
            return true;
        } else if (userAddress.matches("^\\d*[,\\s]?([A-Za-z]+|[A-Za-z]+[\\s[A-Za-z]+]+)$")) {
            return true;
        } else {
            throw new IllegalArgumentException();
        }
    }

    // validate city name
    public static boolean validateCity(String cityName) {

        if (cityName == null || cityName.isEmpty()) {
            return true;
        } else if (cityName.matches("^[A-Za-z]+|[A-Za-z]+([\\s-][A-Za-z]*[\\d]*)*$")) {
            return true;
        } else {
            throw new IllegalArgumentException();
        }
    }

    // validate code postal with validateCodePostal method
    public static boolean validateCodePostal(String codePostal) {

        if (codePostal == null || codePostal.isEmpty()) {
            return true;
        } else if (codePostal.matches("^[0-9]{5}$")) {
            return true;
        } else {
            throw new IllegalArgumentException();
        }

    }

    // validate numero telephone with validateNumeroTelephoneFixe method
    public static boolean validateNumeroTelephoneFixe(String numeroTelephone) {

        if ((numeroTelephone != null) && numeroTelephone.matches("^0[1-9]([-. ]?[0-9]{2}){4}$")) {
            return true;
        } else {
            throw new IllegalArgumentException();
        }
    }

    // validate numero telephone with validateNumeroTelephone method
    public static boolean validateNumeroTelephoneMobile(String numeroTelephone) {

        if (numeroTelephone == null || numeroTelephone.isEmpty()) {
            return true;
        } else if (numeroTelephone.matches("^0[6|7]([-. ]?[0-9]{2}){4}$")) {
            return true;
        } else {
            throw new IllegalArgumentException();
        }
    }

    // validate date of birth with validateDateNaissance method
    public static boolean validateDateNaissance(String dateNaissance) {
        // return (dateNaissance != null) && dateNaissance.matches("^\\d{2}-[A-Z][A-Za-z]{2}-\\d{4}$");

        // Regex expression to check Date validation of the format dd/MM/YYYY
        if (dateNaissance == null || dateNaissance.isEmpty()) {
            return true;
        } else if (dateNaissance.matches("^([0-2]\\d|3[0-1])\\/(0\\d|1[0-2])\\/((?:19|20)\\d{2})$")) {
            return true;
        } else {
            throw new IllegalArgumentException();
        }
    }

    // validate email
    public static void validateEmail(String email) throws AddressException {
        new InternetAddress(java.net.IDN.toASCII(email)).validate();
        // InputValidator.validateEmail(jTfEmail.getText());
    }

    public static boolean regexTel(String text) {

        return text.matches("(0|0033)[1-9][0-9]{8}");

    }

    public static boolean regexEmail(String text) {
        return text.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
    }

    public static boolean regexNom(String text) {
        if (text.isEmpty()) {
            return false;
        } else {
            return text.matches("[a-zA-Z]*");
        }
    }

    public static boolean regexDate(String text) {
        return text.matches("\\d{4}-\\d{2}-\\d{2}");
    }

    public static boolean regexIsbn(String text) {
        return text.matches("(\\d{13})|(\\d{10})");
    }

    public static boolean regexCp(String text) {
        return text.matches("((0[1-9])|([1-8][0-9])|(9[0-8])|(2A)|(2B))[0-9]{3}");
    }

    public static boolean regexAdresse(String text) {
        return text.matches("[0-9]{1,3}(?:(?:[,. ]){1}[-a-zA-Zàâäéèêëïîôöùûüç]+)+");
    }

    public static boolean regexFloat(String text) {
        return text.matches("");
    }

    public static float formatFloatToFloatPrecision(float number, int userPrecision) {
        String strPrecision = "1";
        
        for (int i = 0; i < userPrecision; i++) {
            strPrecision += "0";
        }
        
        int intNumber = (int) (Integer.parseInt(strPrecision) * number);
        float floatNumber = (float) intNumber;

        return floatNumber / Integer.parseInt(strPrecision);

    }

}
