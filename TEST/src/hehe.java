public class hehe {

    public static void main(String[] args) {
    }

    static double beregnAvgift(int antallTimer) {
        double price = 0;
        if (antallTimer > 0)
            price = 40;

        for (int i = 3; i < antallTimer && price <= 180; i++) {
            price += 10;
        }
        return price;
    }


}
