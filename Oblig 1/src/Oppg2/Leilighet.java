package Oppg2;

public class Leilighet extends Eiendom {

    private double fellesGjeld, husleie;
    private int etg;

    public Leilighet(String adresse, String eiersNavn, double takst, int antKvm, int gnr, int bnr) {
        super(adresse, eiersNavn, takst, antKvm, gnr, bnr);
    }

    public void skrivAlleBud() {

    }

    public double getFellesGjeld() {
        return fellesGjeld;
    }

    public double getHusleie() {
        return husleie;
    }

    public int getEtg() {
        return etg;
    }
}
