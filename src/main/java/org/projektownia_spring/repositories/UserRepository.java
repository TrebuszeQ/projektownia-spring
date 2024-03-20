package org.projektownia_spring.repositories;

import org.projektownia_spring.models.User;

public interface UserRepository {
    Iterable<User> findAll();
    User findById(int id);
    User save(User user);
}
