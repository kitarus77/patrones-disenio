package com.example.design_patterns.creationals.factory.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum NotificacionesEnum {
    EMAIL("Email"),
    SMS("Sms");

    private final String tipo;

    public static NotificacionesEnum fromString(String tipoRecibido) {
        for (NotificacionesEnum tipo : NotificacionesEnum.values()) {
            if (tipo.getTipo().equalsIgnoreCase(tipoRecibido)) {
                return tipo;
            }
        }
        throw new IllegalArgumentException("Tipo notificación no válido: " + tipoRecibido);
    }
}

