package com.example.design_patterns.creationals.factory.factories.notification;

public class SmsNotificationService implements NotificationService{
    @Override
    public void sendNotification(String message) {
        //  Lógica del envío de sms
        System.out.println("Simulación de la lógica para el envío de SMS...");
    }
}
