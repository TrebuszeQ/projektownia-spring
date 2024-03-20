package org.projektownia_spring.models;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;


@Data
@RequiredArgsConstructor
public class Image {
    private final JdbcTemplate jdbc;
    private final int id;
    private final String project;
    private final String name;
    private final String path;
    private final String description;
}
