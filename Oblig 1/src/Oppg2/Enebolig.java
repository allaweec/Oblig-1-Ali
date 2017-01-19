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

    protected String getTypeAsString() {
        return "";
    }

//    public void skrivAlleBud() {
//    }

    public int getType() {
        return type;
    }
}
