package be.janickreynders.petanque;

public class Competition {
    void playGame(Player a, Player b, double outcome) {
        System.out.println(a);
        System.out.println(b);
        EloRatingComputation computation = new EloRatingComputation(20);
        double result = computation.compute(a, b, outcome);
        a.adjust(result);
        b.adjust(-result);
        System.out.println("delta = " + result + "\n\n");
    }
}
