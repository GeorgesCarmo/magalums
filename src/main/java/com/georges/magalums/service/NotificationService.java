package com.georges.magalums.service;

import com.georges.magalums.controller.dto.ScheduleNotificationDTO;
import com.georges.magalums.entity.Notification;
import com.georges.magalums.repository.NotificationRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class NotificationService {

    private NotificationRepository notificationRepository;

    public NotificationService(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    public void scheduleNotification(ScheduleNotificationDTO dto){
        notificationRepository.save(dto.toNotification());
    }

    public Optional<Notification> findById(Long notificationId){
        return notificationRepository.findById(notificationId);
    }
}
