package org.projektownia_spring.models;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Email {
    private final int id;
    private String email;
    private User[] users;
}
