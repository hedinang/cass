package com.example.cass.controller;

import com.example.cass.model.entity.Message;
import com.example.cass.repository.MessageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/test")
public class AlarmController {
    private final MessageRepository messageRepository;

    @GetMapping("/test")
    public void alarmList() {
        for (Message message : messageRepository.findAll()) {
            System.out.println("Chuyển đổi dữ liệu thành công!");
        }

    }
}