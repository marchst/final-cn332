/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author thong
 */
public class BillFactory extends AbstractFactory{
    int roomOneBed = 1500;
    int roomTwoBed = 1600;
    int roomKingBed = 3300;
    
    int haveWifi = 300;
    int perPerson = 200;
    
    int allAmount;
    
    public BillFactory(){
        allAmount = 0;
    }
    
    public int calculate(RoomFactory room){
        if(room.getRoomtype() == "one bed"){
            allAmount += roomOneBed;
        }
        if(room.getRoomtype() == "two bed"){
            allAmount += roomTwoBed;
        }
        if(room.getRoomtype() == "king size"){
            allAmount += roomKingBed;
        }
        if(room.getwiFi() == "Yes"){
            allAmount += haveWifi;
        }
        if(room.getcustomerinRoom() != ""){
            allAmount += (perPerson*(Integer.parseInt(room.getcustomerinRoom())));
        }

        if(room.getcheckIn() != "" && room.getcheckOut() != ""){
            String[] split1 = room.getcheckIn().split("/");
            String[] split2 = room.getcheckIn().split("/");
            int day1 = Integer.parseInt(split1[0]);
            int day2 = Integer.parseInt(split2[0]);
            int m1 = Integer.parseInt(split1[1]);
            int m2 = Integer.parseInt(split2[1]);
            if((day2>day1) && (m2>=m1)){
                allAmount += roomOneBed*((day2-day1)+ (m2-m1));
            } else if((day2<day1) && (m2>=m1)) {
                allAmount += roomOneBed*((30-day1+day2)+ (m2-m1));
            }
        }
        
        return allAmount;
    }
}
