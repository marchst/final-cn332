
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thong
 */
public class Customer {
    private String name;
    private String surname;
    private String email;
    
    public Customer(String name,String surname,String email){
        this.name = name;
        this.surname = surname;
        this.email = email;        
    }

    Customer() {
        this("","","");
    }
    
    public void payType(){
        System.out.println("-------------------");
        System.out.println("select payment");
        System.out.println("1) promtpay");
        System.out.println("2) credit card");
        System.out.println("3) cash");
        Scanner scanner = new Scanner(System.in);
        int select = scanner.nextInt();
        if(select == 1){
            Promtpay p = new Promtpay();
            System.out.println("Plese tranfer to account below");
            System.out.println(p.bankAccount());
        }
        if(select == 2){
            System.out.println("Plese type your card number...");
            String select2 = scanner.next();
            CreditCard c = new CreditCard(select2);
        }
        System.out.println("\n---------------------");
        System.out.println("Transaction complete");
        System.out.println("---------------------\n");
        System.out.println("Thank you");
    }
    
    
}
