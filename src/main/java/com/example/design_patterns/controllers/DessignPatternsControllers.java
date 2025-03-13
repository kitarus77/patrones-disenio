package com.example.design_patterns.controllers;

import com.example.design_patterns.creationals.factory.service.NotificationUseCase;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/design-patterns")
@RequiredArgsConstructor
public class DessignPatternsControllers {

    private final NotificationUseCase notificationUseCase;

    @Operation(summary = "Patrón creacional - Factory Method")
    @GetMapping("/creational/factory")
    public ResponseEntity<String> useFactoryMethod (@RequestParam String type, @RequestParam String message) {
        String result = this.notificationUseCase.sendNotification(type, message);
        return ResponseEntity.ok().body(result);
    }

}
