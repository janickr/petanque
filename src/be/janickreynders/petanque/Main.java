package be.janickreynders.petanque;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static be.janickreynders.petanque.Player.Individual;
import static be.janickreynders.petanque.Player.Team;

public class Main {
    public static void main(String[] args) {
        Player janick = new Individual("janick");
        Player tomh = new Individual("tomh");
        Player tomb = new Individual("tomb");
        Player lenne = new Individual("lenne");
        Player jorgo = new Individual("jorgo");
        Player tanguy = new Individual("tanguy");
        Player vincent = new Individual("vincent");
        Player pieter = new Individual("pieter");
        Player erlend = new Individual("erlend");
        Player georgian = new Individual("georgian");


        Competition competition = new Competition();
        competition.playGame(new Team(tomb, janick, tanguy), new Team(lenne, jorgo, tomh), 1d);
        competition.playGame(new Team(tomb, janick, jorgo), new Team(lenne, tomh, vincent), 1d);
        competition.playGame(new Team(tomb, tomh), new Team(janick, jorgo, lenne), 1d);
        competition.playGame(new Team(janick, tomb), jorgo, 0d);
        competition.playGame(new Team(pieter, janick, vincent), new Team(lenne, tanguy, jorgo), 0d);
        competition.playGame(new Team(vincent, tomb), new Team(janick, jorgo), 1d);
        competition.playGame(new Team(vincent, tomb, erlend), new Team(janick, tomh, georgian), 0d);
        competition.playGame(new Team(vincent, jorgo, georgian), new Team(janick, tomb), 0d);
        competition.playGame(new Team(erlend, georgian), new Team(janick, vincent), 1d);
        competition.playGame(new Team(vincent, erlend, georgian), new Team(janick, tomb, jorgo), 0d);
        competition.playGame(new Team(janick, erlend, georgian), new Team(tomb, vincent), 1d);
        competition.playGame(new Team(georgian), new Team(tomb, janick), 1d);
        competition.playGame(new Team(georgian, janick), new Team(tomb, vincent), 1d);
        competition.playGame(new Team(georgian, janick), new Team(tomb, vincent), 1d);
        competition.playGame(new Team(jorgo, janick), new Team(lenne, vincent), 1d);
        competition.playGame(janick, lenne, 1d);
        competition.playGame(new Team(tomb, janick), new Team(erlend, vincent, jorgo), 1d);
        competition.playGame(new Team(tomb, janick), new Team(erlend, vincent), 1d);
        competition.playGame(new Team(tomb), new Team(janick, jorgo), 1d);
        competition.playGame(new Team(jorgo), new Team(tomb, vincent), 1d);
        competition.playGame(new Team(tomb, vincent), new Team(janick, lenne), 1d);
        competition.playGame(new Team(tomb, vincent, lenne), new Team(janick, erlend), 0d);
        competition.playGame(new Team(tomb, lenne), new Team(janick, jorgo), 0d);
        competition.playGame(new Team(lenne, jorgo), new Team(janick, tomb), 1d);
        competition.playGame(new Team(lenne, jorgo), new Team(erlend, vincent), 0d);
        competition.playGame(new Team(lenne), new Team(janick), 0d);

        System.out.println("--------------------------------");
        ArrayList<Player> players = new ArrayList<Player>(Arrays.asList(janick, tomh, tomb, lenne, jorgo, tanguy, vincent, pieter, erlend, georgian));
        Collections.sort(players);
        for (Player player : players) {
            System.out.println(player);
        }
    }

}
