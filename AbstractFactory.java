/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thong
 */
public abstract class AbstractFactory {
    public static RoomFactory createRoom(){
        RoomFactory newRoom = new RoomFactory();
        return newRoom;
    }
    
    public static BillFactory createBill(){
        BillFactory newBill = new BillFactory();
        return newBill;
    }
    
}
