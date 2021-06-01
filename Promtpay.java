/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thong
 */
public class Promtpay implements Payment{

    @Override
    public boolean pay() {
        return true;
    }
    
    public String bankAccount(){
        return "066468465415";
    }
    
}
