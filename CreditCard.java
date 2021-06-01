/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thong
 */
public class CreditCard implements Payment{
    String creditCardNumber;
    
    public CreditCard(){
        this("");
    }
    
    public CreditCard(String cc){
        creditCardNumber = cc;
    }
    
    @Override
    public boolean pay() {
        return true;
    }
    
}
