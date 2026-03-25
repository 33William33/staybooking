package com.self.staybooking.model;

public record ErrorResponse(
        String message,
        String error
) {
}
