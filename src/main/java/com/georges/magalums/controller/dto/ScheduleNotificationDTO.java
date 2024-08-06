package com.georges.magalums.controller.dto;

import com.georges.magalums.entity.Channel;
import com.georges.magalums.entity.Notification;
import com.georges.magalums.entity.Status;

import java.time.LocalDateTime;

public record ScheduleNotificationDTO (LocalDateTime dateTime,
                                       String destination,
                                       String message,
                                       Channel.values channel){

    public Notification toNotification(){
        return new Notification(
                dateTime,
                destination,
                message,
                channel.toChannel(),
                Status.values.PENDING.toStatus()
        );
    }
}
