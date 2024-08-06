package com.georges.magalums.controller;

import com.georges.magalums.controller.dto.ScheduleNotificationDTO;
import com.georges.magalums.service.NotificationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notifications")
public class NotificationController {

    private final NotificationService notificationService;

    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @PostMapping
    public ResponseEntity<?> scheduleNotification(@RequestBody ScheduleNotificationDTO dto){
        notificationService.scheduleNotification(dto);

        return ResponseEntity.accepted().build();
    }

/*    @GetMapping("/{notificationId}")
    public ResponseEntity<?> getNotification(@PathVariable("notificationId") Long notificationId){

    }*/
}
