package com.example.design_patterns.creationals.factory.factories.notification;

import com.example.design_patterns.creationals.factory.enums.NotificacionesEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class NotificationServiceFactory {

    public static NotificationService getNotificationService(String type) {

        NotificacionesEnum tipoNotificacion = NotificacionesEnum.fromString(type);

        switch (tipoNotificacion) {
            case SMS -> {
                log.debug("Notificación enviada por email.");
                return new EmailNotificationService();
            }
            case EMAIL -> {
                log.debug("Notificación enviada por sms.");
                return new SmsNotificationService();
            }
            default -> {
                String error = "Tipo de notificación no soportado";
                log.error(error);
                throw new IllegalArgumentException(error);
            }
        }

    }

}
