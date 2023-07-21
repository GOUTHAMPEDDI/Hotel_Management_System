package com.GouthamPeddi.HotelManagementSystem.controller;

import com.GouthamPeddi.HotelManagementSystem.model.HotelRoom;
import com.GouthamPeddi.HotelManagementSystem.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RoomController {

    @Autowired
    RoomService roomService;

    @GetMapping("Rooms")
    public Iterable<HotelRoom> getAllRooms(){
        return roomService.getAllRooms();
    }

    @PostMapping("room")
    public String addRoom(@RequestBody HotelRoom room){
        return roomService.addRoom(room);
    }

    @GetMapping("room/{id}")
    public HotelRoom getRoomById(@PathVariable Long id){
        return roomService.getRoomById(id);
    }

    @DeleteMapping("room/{id}")
    public String deleteRoomById(@PathVariable Long id){
        return roomService.deleteRoomById(id);
    }

    @PutMapping("room/{id}/status/{status}")
    public String updateRoomStatusById(@PathVariable Long id,@PathVariable Boolean status){
        return roomService.updateRoomStatusById(id,status);
    }

    @PostMapping("rooms")
    public String addRooms(@RequestBody List<HotelRoom> rooms){
        return roomService.addRooms(rooms);
    }

}
