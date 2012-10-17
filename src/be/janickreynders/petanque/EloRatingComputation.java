package be.janickreynders.petanque;

import static java.lang.Math.pow;

public class EloRatingComputation {
    private double K = 30;

    public EloRatingComputation(int k) {
        K = k;
    }

    double compute(Player a, Player b, double outcome) {
        double Ea = 1d /(1d + pow(10d, ((double) (b.getRating() - a.getRating())) / 400d));
        System.out.println("Ea: " + Ea);
        return Math.min(a.size(), b.size())*K*(outcome - Ea);
    }
}
