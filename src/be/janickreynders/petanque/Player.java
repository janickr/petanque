package be.janickreynders.petanque;

import java.util.Arrays;

public abstract class Player implements Comparable<Player> {
    public abstract int getRating();
    public abstract void adjust(double delta);

    public int compareTo(Player o) {
        return getRating()-o.getRating();
    }

    public abstract int size();

    public static class Team extends Player {

        private Player[] members;

        protected Team(Player... members) {
            this.members = members;
        }

        @Override
        public int getRating() {
            int total = 0;
            for (Player member : members) {
                total += member.getRating();
            }
            return total / members.length;
        }

        @Override
        public void adjust(double delta) {
            delta = Math.round((delta / (double) members.length)); // verdeel over spelers zodat punten niet lekken

            for (Player member : members) {
                member.adjust(delta);
            }
        }

        @Override
        public int size() {
            return members.length;
        }

        @Override
        public String toString() {
            return  Arrays.asList(members)+ ": " + getRating();
        }
    }
    
    public static class Individual extends Player {
        private String name;
        private int rating = 1000;

        protected Individual(String name) {
            this.name = name;
        }

        @Override
        public int getRating() {
            return rating;
        }

        @Override
        public void adjust(double delta) {
            rating += Math.round(delta);
        }

        @Override
        public int size() {
            return 1;
        }

        @Override
        public String toString() {
            return name + ": " + rating;
        }
    }
}
