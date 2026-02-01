package com.chat_app_backend.service;

import com.chat_app_backend.entities.Message;
import com.chat_app_backend.playload.MessageRequest;

public interface ChatService {

    Message sendMessage(String roomId, MessageRequest request);
}
