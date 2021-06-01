/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author thong
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to hotel booking system.");
        System.out.println("-----------------------------.");
        System.out.println("----Log in----- .");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your email:");
        String email = scanner.nextLine();
        System.out.println("Enter your password:");
        String password = scanner.nextLine();
        if(Login.Authentication(email, password)){
            System.out.println("Authentication successfully\n");
        }
        
        Customer c = new Customer();
        RoomFactory room = AbstractFactory.createRoom();
        room.roomInfo();
        BillFactory bill = AbstractFactory.createBill();
        int price = bill.calculate(room);
        System.out.println("\nYour room price is ....");
        System.out.println(String.valueOf(price));
        
        c.payType();
        
    }
}
