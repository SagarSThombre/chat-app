package com.chat_app_backend.repositories;

import com.chat_app_backend.entities.Room;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoomRepository extends MongoRepository<Room, String> {
    // get room by roomId
    Room findByRoomId(String roomId);
}
