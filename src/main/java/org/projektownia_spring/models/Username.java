package org.projektownia_spring.models;

import lombok.Data;
import lombok.RequiredArgsConstructor;


@Data
@RequiredArgsConstructor
public class Username {
    private final int id;
    private final String username;
    private final User[] users;
}
