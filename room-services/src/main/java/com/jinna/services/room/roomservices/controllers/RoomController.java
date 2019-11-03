

package com.jinna.services.room.roomservices.controllers;

import com.jinna.services.room.roomservices.models.Room;
import com.jinna.services.room.roomservices.repository.RoomRepository;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
public class RoomController {

    @Autowired
    private RoomRepository roomRepository;

    @GetMapping("/rooms")
    public List<Room> findAll(@RequestParam(name = "roomNumber", required = false) String roomNumber) {

        if (StringUtils.isNotEmpty(roomNumber)) {
            return Collections.singletonList(this.roomRepository.findByRoomNumber(roomNumber));
        }
        return (List<Room>) this.roomRepository.findAll();
    }

}
