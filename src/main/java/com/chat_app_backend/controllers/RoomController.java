package com.chat_app_backend.controllers;

import com.chat_app_backend.entities.Room;
import com.chat_app_backend.service.RoomService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/rooms")
public class RoomController {
    private RoomService roomService;

    public RoomController(RoomService roomService) {
        this.roomService = roomService;
    }

    //create room
    @PostMapping
    public ResponseEntity<?> createRoom(@RequestBody String roomId){
        try{
            Room room = roomService.createRoom(roomId);
            return ResponseEntity.status(HttpStatus.CREATED).body(room);
        }catch (RuntimeException ex){
            return ResponseEntity.badRequest().body(ex.getMessage());
        }
    }

    //join room
    @GetMapping("/{roomId}")
    public ResponseEntity<?> joinRoom(@PathVariable String roomId){
        try {
            Room room = roomService.joinRoom(roomId);
            return ResponseEntity.ok(room);
        }catch (RuntimeException ex){
            return ResponseEntity.badRequest().body(ex.getMessage());
        }
    }


}
