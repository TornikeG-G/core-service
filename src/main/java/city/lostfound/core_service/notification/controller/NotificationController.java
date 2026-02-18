package city.lostfound.core_service.notification.controller;


import city.lostfound.core_service.notification.core.NotificationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notifications")
@RequiredArgsConstructor
public class NotificationController {

    private NotificationService notificationService;

    @PostMapping
    public void sendNotification() {
        notificationService.sendNotification();
    }
}
