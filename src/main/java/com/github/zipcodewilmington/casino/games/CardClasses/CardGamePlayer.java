package com.github.zipcodewilmington.casino.games.CardClasses;

import com.github.zipcodewilmington.casino.Accounts.CasinoAccount;
import com.github.zipcodewilmington.casino.PlayerInterface;

import java.util.Stack;

public class CardGamePlayer implements PlayerInterface {

    private Hand hand;
    double wagerAmount;



    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public double getWagerAmount() {
        return wagerAmount;
    }

    public void setWagerAmount(double wagerAmount) {
        this.wagerAmount = wagerAmount;
    }

    public int getHandTotal(){
        return 0;
    }

    public Stack<Card> drawCards(int numToDraw){

        return new Stack<>();
    }

    public void takeTurn(){}

    @Override
    public CasinoAccount getArcadeAccount() {
        return null;
    }

    @Override
    public <SomeReturnType> SomeReturnType play() {
        return null;
    }
}
