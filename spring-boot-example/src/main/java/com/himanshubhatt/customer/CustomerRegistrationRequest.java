package com.himanshubhatt.customer;

public record CustomerRegistrationRequest(
        String name,
        String email,
        Integer age

) {
}
