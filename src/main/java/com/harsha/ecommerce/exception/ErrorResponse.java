package com.harsha.ecommerce.exception;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;


public record ErrorResponse(
        @NotNull String message,
        int status,
        @NotNull LocalDateTime timestamp
) {}


