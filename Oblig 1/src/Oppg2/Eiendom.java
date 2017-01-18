package Oppg2;

import java.util.ArrayList;

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
        budOversikt.add(new Bud(navn,tel,belop,frist));
    }

    public String getSisteBud() {
        return "";
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
