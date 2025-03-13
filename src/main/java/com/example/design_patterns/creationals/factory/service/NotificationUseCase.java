package com.example.design_patterns.creationals.factory.service;

import com.example.design_patterns.creationals.factory.factories.notification.NotificationService;
import com.example.design_patterns.creationals.factory.factories.notification.NotificationServiceFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class NotificationUseCase {

    public String sendNotification (String type, String message) {
        log.info("Enviando notificación...");
        NotificationService service = NotificationServiceFactory.getNotificationService(type);
        service.sendNotification("¡Enhorabuena por crear tu primer mensaje con el patrón Factory!");
        String result = "Notificación enviada con éxito.";
        log.info(result);
        return result;
    }

}
