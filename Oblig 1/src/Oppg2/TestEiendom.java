package Oppg2;

public class TestEiendom {
    public static void main(String[] args) {
// Oppretter et enebolig objekt
        Enebolig eb1 = new Enebolig("Marihandstien 2", "Ole Joan Olsen", 1100000, 204,
                23, 400, Enebolig.FRITTSTAAENDE);
// Legger inn etpar bud
        eb1.nyttBud("Ole Pedersen", 2400000, "90522355", 24);
        eb1.nyttBud("John McIntosh", 2500000, "90822655", 12);
// Lister alle bud
        eb1.skrivAlleBud(); // skrivAlleBud må OVERRIDES for hvert type salgsobjekt
        // salgsobjekt = Eiendom, Enebolig eller Leilighet
// DU skal:
// Opprette en ArrayList som holder rede på de ulike salgsobjektene
// Lage noen salgsobjekter som legges inn i arraylisten (kan hardkodes som over, trenger ingen brukerdialog)
// Lage noen bud pr salgsobjekt (kan hardkodes som over, trenger ingen brukerdialog)
// Deretter:
        // Lage en ENKEL brukerdialog (i løkke) som spør etter gnr og bnr
// og deretter lister alle bud for dette objektet
    }
}
