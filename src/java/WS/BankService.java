/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS;


import Beans.Transaction;
import Normal_Classes.DataStorage;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author Sweetpink
 */
@WebService(serviceName = "BankService")
@Stateless
public class BankService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "MakePayment")
    public String MakePayment(@WebParam(name = "creditCard") String creditCard, @WebParam(name = "paymentAmount") float paymentAmount) {
        DataStorage.getInstance().createAccounts();
        Transaction transaction = new Transaction();
        int valid = transaction.CheckFunds(creditCard, paymentAmount);
        if(valid == 0){
            return "Not enough funds cash on the creditcard";
        }else if(valid == 1){
            
            transaction.MakePayment(creditCard, paymentAmount);
            return "The transaction was successful, " + paymentAmount + "was drawn";
        }
        
        return null;
    }

    /**
     * Web service operation
     */
    
    
    
    
    
}
