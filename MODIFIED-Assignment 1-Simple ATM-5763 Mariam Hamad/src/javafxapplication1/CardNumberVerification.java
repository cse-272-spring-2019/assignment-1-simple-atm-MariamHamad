/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

//javafxapplication1;

/**
 *
 * @author Mariuma
 */
public class CardNumberVerification {
    
     private final String cardNumber="2345";
     
        public Boolean verifyCardNumber(String cardNumber)
     {
         if(Integer.parseInt(this.cardNumber)==Integer.parseInt(cardNumber))
             return true;
         else
            return false;
}
}
