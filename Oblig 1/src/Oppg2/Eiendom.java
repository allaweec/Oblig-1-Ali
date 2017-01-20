package Oppg2;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Eiendom {

    private String adresse, eiersNavn;
    private double takst;
    private int antKvm, gnr, bnr;
    protected ArrayList<Bud> budOversikt;

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
    }

    public String getSisteBud() {
        return "Siste Bud:\n" + budOversikt.get(budOversikt.size() - 1);
    }

    public void skrivAlleBud() {
        System.out.println(
                "Bud gitt for eiendommen " + getAdresse() + ", takst = " + getTakst() + ", gnr = " + getGnr()
                        + "bnr = " + getBnr() + ":"
        );
        System.out.println("Bud gitt\t\t\t\t\t\tBud Frist\t\t\t\t\t\tNavn\t\t\tTlf\t\t\tBeløp");

        for (int i = 0; i < budOversikt.size(); i++) {

            System.out.println(
                    budOversikt.get(i).getBudGitt().getTime() + "\t" +
                    budOversikt.get(i).getBudFrist().getTime() + "\t" +
                    budOversikt.get(i).getNavn() + "\t" +
                    budOversikt.get(i).getTelefon() + "\t" +
                    budOversikt.get(i).getBelop()
            );
        }
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
