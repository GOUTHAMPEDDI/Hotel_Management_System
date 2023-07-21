package com.GouthamPeddi.HotelManagementSystem.repository;

import com.GouthamPeddi.HotelManagementSystem.model.HotelRoom;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRoomRepo extends CrudRepository<HotelRoom,Long> {
}
