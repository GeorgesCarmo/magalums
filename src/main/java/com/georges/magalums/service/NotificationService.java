package com.georges.magalums.service;

import com.georges.magalums.controller.dto.ScheduleNotificationDTO;
import com.georges.magalums.repository.NotificationRepository;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    private NotificationRepository notificationRepository;

    public NotificationService(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    public void scheduleNotification(ScheduleNotificationDTO dto){
        notificationRepository.save(dto.toNotification());
    }
}
