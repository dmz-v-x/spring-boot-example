package com.himanshubhatt.customer;

public record CustomerUpdateRequest(
        String name,
        String email,
        Integer age
) {
}
