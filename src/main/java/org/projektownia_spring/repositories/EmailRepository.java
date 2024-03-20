package org.projektownia_spring.repositories;

import org.projektownia_spring.models.Email;

public interface EmailRepository {
    Iterable<Email> findAll();
    Email findById(int id);
    Email save(Email email);
}
