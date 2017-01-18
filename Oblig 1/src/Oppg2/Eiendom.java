package Oppg2;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Eiendom {

    private String adresse, eiersNavn;
    private double takst;
    private int antKvm, gnr, bnr;
    private ArrayList<Bud> budOversikt;

    public Eiendom(String adresse, String eiersNavn, double takst, int antKvm, int gnr, int bnr) {
        this.adresse = adresse;
        this.eiersNavn = eiersNavn;
        this.takst = takst;
        this.antKvm = antKvm;
        this.gnr = gnr;
        this.bnr = bnr;

        budOversikt = new ArrayList<Bud>();
    }

    protected void nyttBud(String navn, float belop, String tel, int frist) {
        GregorianCalendar fristToCalendar = new GregorianCalendar();
        fristToCalendar.add(Calendar.HOUR_OF_DAY, frist);
        budOversikt.add(new Bud(navn,tel,belop,fristToCalendar));
        System.out.println("Bud gitt for " + this);
    }

    public String getSisteBud() {
        return "Siste Bud:\n" + budOversikt.get(budOversikt.size() - 1);
    }

    public void skrivAlleBud() {

    }

    public String getAdresse() {
        return adresse;
    }

    public String getEiersNavn() {
        return eiersNavn;
    }

    public double getTakst() {
        return takst;
    }

    public int getAntKvm() {
        return antKvm;
    }

    public int getGnr() {
        return gnr;
    }

    public int getBnr() {
        return bnr;
    }

    public ArrayList<Bud> getBudOversikt() {
        return budOversikt;
    }
}
