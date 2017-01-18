package Normal_Classes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sweetpink
 */
public class CreditCard {
    private float balance;
    private String creditCardNumber;
    
    public CreditCard(int balance, String creditCardNumber){
        this.balance = balance;
        this.creditCardNumber = creditCardNumber;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getCreditCardNumber() {
        return creditCardNumber;
    }

    public void setCreditCardNumber(String creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }
    
    
}
