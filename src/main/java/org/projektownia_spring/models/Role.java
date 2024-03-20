package org.projektownia_spring.models;


import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Role {
    private final int id;
    private final String name;
    private final String description;
    private User[] users;
}
