package com.gp2.outils;

import java.util.HashMap;


public class CustomedException extends Exception{
    public static final int SQL_ERR = 10;
    public static final int USER_ERR = 20;
    public static final int SYST_ERR = 50;
    
    private int numero;    
    private HashMap<String, String> erreurs;

    public CustomedException() {
    }

    public CustomedException(String message) {
        super(message);
    }

    public CustomedException(int numero, HashMap<String, String> erreurs, String message) {
        super(message);
        this.numero = numero;
        this.erreurs = erreurs;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public HashMap<String, String> getErreurs() {
        return erreurs;
    }

    public void setErreurs(HashMap<String, String> erreurs) {
        this.erreurs = erreurs;
    }
    
    
    
}
