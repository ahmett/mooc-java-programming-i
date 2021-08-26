/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ahmet
 */
public class PaymentCard {

    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    @Override
    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }

    public void eatAffordably() {
        double price = 2.60;

        if (this.balance >= price) {
            this.balance -= price;
        }
    }

    public void eatHeartily() {
        double price = 4.60;

        if (this.balance >= price) {
            this.balance -= price;
        }
    }

    public void addMoney(double amount) {
        double maxBalance = 150.0;

        if (this.balance < maxBalance && amount > 0) {
            if (this.balance + amount > maxBalance) {
                this.balance = maxBalance;
            } else {
                this.balance += amount;
            }
        }
    }
}
