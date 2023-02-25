package com.FrightBox.Exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ErrorDetails {

    private String message;

    private String description;

    private LocalDateTime timeStamp;
}
