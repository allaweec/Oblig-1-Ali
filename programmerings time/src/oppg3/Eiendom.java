package oppg3;

public class Eiendom {

    private String adresse;
    private int antallRom;
    private int antallKvm;
    private double[] bud;
    private int antBud;
    private static int antEiendommer;

    public Eiendom(String adresse, int antallRom, int antallKvm) {
        this.adresse = adresse;
        this.antallRom = antallRom;
        this.antallKvm = antallKvm;
        bud = new double[20];
        antBud = 0;
        antEiendommer++;
    }

    public void nyttBud(double budBelop) {
        antBud++;
        if (bud.length <= antBud) {
            double[] tempBud = bud;
            bud = new double[antBud * 2];
            for (int i = 0; i < tempBud.length; i++) {
                bud[i] = tempBud[i];
            }
        }

        if (antBud - 1 == 0 && budBelop > bud[antBud - 1]) {
            bud[0] = budBelop;
        }else if (budBelop > bud[antBud - 1]) {
            bud[antBud] = budBelop;
        } else {
            System.out.println("Beklager, ditt bud er lavere enn forrige bud. Venligst legg inn et høyere bud");
        }
    }

    public void skrivEiendom() {
        System.out.println("Adresse: " + adresse);
        System.out.println("Antall rom: " + antallRom);
        System.out.println("Antall kvm: " + antallKvm);
        System.out.println("Følgende bud gitt: ");
        for (int i = 0; i < bud.length; i++) {
            if (bud[i] > 0) {
                System.out.println(bud[i]);
            }
        }
    }

    public static int getAntEiendommer() {
        return antEiendommer;
    }

}