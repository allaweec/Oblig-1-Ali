package oppg3;

public class Megler{

    public static void main (String[] args){

        Eiendom eiendomEn = new Eiendom("Mørkved", 4, 120);
        Eiendom eiendomTo = new Eiendom("Hunstad", 2, 40);

        eiendomEn.nyttBud(4500000);
        eiendomEn.nyttBud(2200000);
        eiendomEn.nyttBud(4600000);
        eiendomEn.nyttBud(4600000);
        eiendomEn.nyttBud(4600000);
        eiendomEn.nyttBud(4600000);eiendomEn.nyttBud(4600000);eiendomEn.nyttBud(4600000);
        eiendomEn.nyttBud(4600000);
        eiendomEn.nyttBud(4600000);
        eiendomEn.nyttBud(4600000);
        eiendomEn.nyttBud(4600000);
        eiendomEn.nyttBud(4600000);eiendomEn.nyttBud(4600000);
        eiendomEn.nyttBud(4600000);
        eiendomEn.nyttBud(4600000);
        eiendomEn.nyttBud(4600000);eiendomEn.nyttBud(4600000);
        eiendomEn.nyttBud(4600000);
        eiendomEn.nyttBud(4600000);
        eiendomEn.nyttBud(4600000);
        eiendomEn.nyttBud(4600000);
        eiendomEn.nyttBud(4600000);
        eiendomEn.nyttBud(4600000);eiendomEn.nyttBud(4600000);eiendomEn.nyttBud(4600000);
        eiendomEn.nyttBud(4600000);
        eiendomEn.nyttBud(4600000);








        eiendomTo.nyttBud(1100000);
        eiendomTo.nyttBud(1300000);
        eiendomTo.nyttBud(2100000);
        eiendomTo.nyttBud(1900000);

        eiendomEn.skrivEiendom();
        eiendomTo.skrivEiendom();

        System.out.println(Eiendom.getAntEiendommer());
    }

}
