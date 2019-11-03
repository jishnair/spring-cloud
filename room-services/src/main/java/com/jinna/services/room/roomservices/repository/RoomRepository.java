

package com.jinna.services.room.roomservices.repository;

import com.jinna.services.room.roomservices.models.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends CrudRepository<Room, Long> {

    Room findByRoomNumber(String roomBumber);

}
