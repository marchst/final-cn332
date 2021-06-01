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
public class RoomFactory extends AbstractFactory{
    private String[] roomType = new String[]{"one bed", "two bed", "king size"};
    private String[] wifi = new String[]{"Yes", "No"};
    private String[] customerInRoom = new String[]{"1", "2", "3", "4"};
    private String roomtype;
    private String wiFi;
    private String customerinRoom;
    private String checkIn;
    private String checkOut;
    
    public RoomFactory(){
        roomtype = "";
        wiFi = "";
        customerinRoom = "";
        checkIn = "";
        checkOut = "";
        select();
    }
    
    public String getRoomtype(){
        return roomtype;
    }
    public String getwiFi(){
        return wiFi;
    }
    public String getcustomerinRoom(){
        return customerinRoom;
    }
    public String getcheckIn(){
        return checkIn;
    }
    public String getcheckOut(){
        return checkOut;
    }
    
    public void select(){
        System.out.println("-------------------");
        System.out.println("select room detail");
        System.out.println("1) Room type");
        System.out.println("2) WiFi");
        System.out.println("3) In room customer");
        System.out.println("4) Check in");
        System.out.println("5) Check out");
        System.out.println("6) Next");
        System.out.println("=>");
        Scanner scanner = new Scanner(System.in);
        int select = scanner.nextInt();
        if(select == 1){
            select1();
        }
        if(select == 2){
            select2();
        }
        if(select == 3){
            select3();
        }
        if(select == 4){
            select4();
        }
        if(select == 5){
            select5();
        }
        if(select == 6){
            select6();
        }
        
    }
    
    public void select1(){
        System.out.println("-------------------");
        System.out.println("select room type");
        System.out.println("1) One bed");
        System.out.println("2) Two bed");
        System.out.println("3) King size");
        Scanner scanner = new Scanner(System.in);
        int select = scanner.nextInt();
        if(select > roomType.length){
            System.out.println("-------------------");
            System.out.println("Try again");
            select1();
        } else {
            roomtype = roomType[select-1];
        } 
        select();
    }
    
    public void select2(){
        System.out.println("-------------------");
        System.out.println("select wifi option");
        System.out.println("1) Yes");
        System.out.println("2) No");
        Scanner scanner = new Scanner(System.in);
        int select = scanner.nextInt();
        if(select > wifi.length) {
            System.out.println("-------------------");
            System.out.println("Try again");
            select2();
            
        } else {
            wiFi = wifi[select-1];
        }    
        select();
    }
    public void select3(){
        System.out.println("-------------------");
        System.out.println("select customer in room");
        System.out.println("1) 1");
        System.out.println("2) 2");
        System.out.println("3) 3");
        System.out.println("4) 4");
        Scanner scanner = new Scanner(System.in);
        int select = scanner.nextInt();
        if(select > customerInRoom.length) {
            System.out.println("-------------------");
            System.out.println("Try again");
            select3();
            
        } else {
            customerinRoom = customerInRoom[select-1];
        }
        
        select();
    }
    public void select4(){
        System.out.println("-------------------");
        System.out.println("type you checkin date i.e. 10/10/10");
        Scanner scanner = new Scanner(System.in);
        String select = scanner.next();
        checkIn = select;
        select();
    }
    public void select5(){
        System.out.println("-------------------");
        System.out.println("type you checkout date i.e. 10/10/10");
        Scanner scanner = new Scanner(System.in);
        String select = scanner.next();
        checkOut = select;
        select();
    }
    public void select6(){
        System.out.println("-------------------");
        System.out.println("Create room complete.");   
    }
    
    public void roomInfo(){
        System.out.println("-----------------"); 
        System.out.println("Room Information"); 
        System.out.println("-----------------"); 
        System.out.println("Type: ".concat(roomtype)); 
        System.out.println("WiFi: ".concat(wiFi)); 
        System.out.println("Person in room: ".concat(customerinRoom)); 
        System.out.println("Check In: ".concat(checkIn)); 
        System.out.println("Check Out: ".concat(checkOut)); 
    }
}
