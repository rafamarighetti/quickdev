package com.quickdev.model.response;
import org.springframework.http.HttpStatus;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ErrorResponse {
    HttpStatus httpStatus;
    String message;
}
