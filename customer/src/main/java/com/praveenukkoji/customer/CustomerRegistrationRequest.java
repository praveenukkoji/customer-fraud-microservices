package com.praveenukkoji.customer;

public record CustomerRegistrationRequest (
        String firstName,
        String lastName,
        String email){
}
