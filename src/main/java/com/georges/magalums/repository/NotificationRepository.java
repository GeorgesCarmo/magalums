package com.georges.magalums.repository;

import com.georges.magalums.entity.Notification;
import com.georges.magalums.entity.Status;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface NotificationRepository extends JpaRepository<Notification, Long> {

    List<Notification> findByStatusInAndLocalTimeBefore(List<Status> status, LocalDateTime localTime);

}
