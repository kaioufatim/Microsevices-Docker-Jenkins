package com.example.notificationservice;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostPlacedEvent {
    private String postNumber;
    private String userId;
}
