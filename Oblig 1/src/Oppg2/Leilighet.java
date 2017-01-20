package Oppg2;

public class Leilighet extends Eiendom {

    private double fellesGjeld, husleie;
    private int etg;

    public Leilighet(String adresse, String eiersNavn, int antKvm, int gnr, int bnr, double fellesGjeld, double husleie, int etg) {
        super(adresse, eiersNavn, 0, antKvm, gnr, bnr);
        this.fellesGjeld = fellesGjeld;
        this.husleie = husleie;
        this.etg = etg;
    }

    @Override
    public void skrivAlleBud() {
        System.out.println("Bud gitt for LEILIGHET " + getAdresse() + ", husleie = " + getHusleie() +
                ", felles gjeld = " + getFellesGjeld() + ", gnr = " + getGnr() + ", bnr = " + getBnr() +
                ", etg = " + getEtg() + ":"
        );

        System.out.println("Bud gitt\t\t\t\t\t\tBud Frist\t\t\t\t\t\tNavn\t\t\tTlf\t\t\tBeløp");
        for (int i = 0; i < budOversikt.size(); i++) {
            System.out.println(
                    budOversikt.get(i).getBudGitt().getTime() + "\t" +
                            budOversikt.get(i).getBudFrist().getTime() + "\t" +
                            budOversikt.get(i).getNavn() + "\t" + budOversikt.get(i).getTelefon() + "\t" + budOversikt.get(i).getBelop()
            );
        }
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

    @Override
    public String toString() {
        return "LEILIGHET " + getAdresse() + ", husleie = " + getHusleie() +
                ", felles gjeld = " + getFellesGjeld() + ", gnr = " + getGnr() + ", bnr = " + getBnr() +
                ", etg = " + getEtg();
    }
}
