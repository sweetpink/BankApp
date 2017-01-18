package Normal_Classes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;

/**
 *
 * @author Sweetpink
 */
public class DataStorage {

    private static DataStorage dataStorage = null;
    private ArrayList<CreditCard> creditCardList = new ArrayList<>();
    private boolean created = false;

    private DataStorage() {
    }

    public static DataStorage getInstance() {
        if (dataStorage == null) {
            dataStorage = new DataStorage();
        }

        return dataStorage;
    }

    public ArrayList<CreditCard> getCreditCardList() {
        return creditCardList;
    }

    public void addCreditCardList(CreditCard creditCard) {
        creditCardList.add(creditCard);
    }

    public void createAccounts() {
        if (created == false) {
            addCreditCardList(new CreditCard(100, "234567890"));
            addCreditCardList(new CreditCard(30, "123456789"));
            addCreditCardList(new CreditCard(10, "012345678"));
            created = true;
        }
    }

}
