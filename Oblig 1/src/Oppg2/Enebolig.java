package Oppg2;

public class Enebolig extends Eiendom {

    public static final int FRITTSTAAENDE = 1;
    public static final int REKKE = 2;
    public static final int TOMANNS = 3;
    private int type;

    public Enebolig(String adresse, String eiersNavn, double takst, int antKvm, int gnr, int bnr, int type) {
        super(adresse, eiersNavn, takst, antKvm, gnr, bnr);
        this.type = type;
    }

    @Override
    public void skrivAlleBud() {
        System.out.println(
                "Bud gitt for ENEBOLIG " + getAdresse() + ", takst = " + getTakst() + ", gnr = " + getGnr()
                + ", bnr = " + getBnr() + ", type = " + getTypeAsString() + ":"
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

    protected String getTypeAsString() {
        if (type == 1)
            return "Frittstående";
        else if (type == 2)
            return "Rekke";
        else if (type == 3)
            return "Tomanns";
        else
            return "Feil ved systemet, vennligst kontakt " + getEiersNavn();
    }

    @Override
    public String toString() {
        return "ENEBOLIG " + getAdresse() + ", takst = " + getTakst() + ", gnr = " + getGnr()
                + ", bnr = " + getBnr() + ", type = " + getTypeAsString();
    }
}
