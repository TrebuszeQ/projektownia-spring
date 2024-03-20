package org.projektownia_spring.models;

import lombok.Data;
import lombok.RequiredArgsConstructor;


@Data
@RequiredArgsConstructor
public class User {
    private final int id;
    private final String username;
    private final String password;
    private final Email email;
    private final String created_at;
    private String updated_at;
}
