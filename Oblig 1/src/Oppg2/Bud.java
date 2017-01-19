package Oppg2;

import java.util.GregorianCalendar;

public class Bud {

    private GregorianCalendar budGitt, budFrist;
    private float belop;
    private String navn, telefon;

    public Bud(String navn, String telefon, float belop, GregorianCalendar frist) {
        this.navn = navn;
        this.telefon = telefon;
        this.belop = belop;

        budGitt = new GregorianCalendar();
        budFrist = new GregorianCalendar();
    }

    public GregorianCalendar getBudGitt() {
        return budGitt;
    }

    public GregorianCalendar getBudFrist() {
        return budFrist;
    }

    public float getBelop() {
        return belop;
    }

    public String getNavn() {
        return navn;
    }

    public String getTelefon() {
        return telefon;
    }

    public String toString() {
        return "Navn: " + navn +
                "\nTel: " + telefon +
                "\nBeløp: " + belop +
                "\nBud Dato: " + budGitt;
    }

}
