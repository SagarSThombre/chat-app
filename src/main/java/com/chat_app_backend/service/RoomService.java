package com.chat_app_backend.service;

import com.chat_app_backend.entities.Message;
import com.chat_app_backend.entities.Room;

import java.util.List;

public interface RoomService {

    Room createRoom(String roomId);

    Room joinRoom(String roomId);

    List<Message> getMessages(String roomId, int page, int size);
}