/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import Normal_Classes.CreditCard;
import Normal_Classes.DataStorage;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;

/**
 *
 * @author Sweetpink
 */
@Stateless
@LocalBean
public class Transaction {

    public int CheckFunds(String creditCardNumber, float paymentAmount) {
        int response = 2;
        CreditCard creditCard = null; 
        for(CreditCard creditCardLoop : DataStorage.getInstance().getCreditCardList()){
            if(creditCardLoop.getCreditCardNumber().equalsIgnoreCase(creditCardNumber)){
                creditCard = creditCardLoop;
            }
        }
        if(paymentAmount > creditCard.getBalance()){
            response = 0;
        }
        if(paymentAmount <= creditCard.getBalance()){
            response = 1;
        }
        return response;
    }
    
    

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    public int MakePayment(String creditCardNumber, float paymentAmount) {
        int response = 0;
        CreditCard creditCard = null; 
        for(CreditCard creditCardLoop : DataStorage.getInstance().getCreditCardList()){
            if(creditCardLoop.getCreditCardNumber().equalsIgnoreCase(creditCardNumber)){
                creditCard = creditCardLoop;
            }
        }
        creditCard.setBalance(creditCard.getBalance() - paymentAmount);
        if(creditCard.getBalance() >= 0){
            response = 1;
        }
        return response;
    }
    
    
}
