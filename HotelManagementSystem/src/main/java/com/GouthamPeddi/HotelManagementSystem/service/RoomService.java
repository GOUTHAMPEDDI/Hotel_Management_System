package com.GouthamPeddi.HotelManagementSystem.service;

import com.GouthamPeddi.HotelManagementSystem.model.HotelRoom;
import com.GouthamPeddi.HotelManagementSystem.repository.IRoomRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {

    @Autowired
    IRoomRepo roomRepo;


    public Iterable<HotelRoom> getAllRooms() {
        return roomRepo.findAll();
    }


    public String addRoom(HotelRoom room) {
        roomRepo.save(room);
        return "room added";
    }


    public HotelRoom getRoomById(Long id) {
        Iterable<HotelRoom> rooms=getAllRooms();
        for(HotelRoom room : rooms){
            if(room.getRoomId().equals(id)){
                return room;
            }
        }
        throw new IllegalStateException("id not found");
    }


    public String deleteRoomById(Long id) {
        roomRepo.deleteById(id);
        return "room deleted";
    }


    public String updateRoomStatusById(Long id,Boolean status) {
        Iterable<HotelRoom> rooms=getAllRooms();
        for(HotelRoom room : rooms){
            if(room.getRoomId().equals(id)){
                room.setRoomStatus(status);
                return "status updated";
            }
        }
        return "id not found";
    }

    public String addRooms(List<HotelRoom> rooms) {
        roomRepo.saveAll(rooms);
        return "rooms added";
    }
}
