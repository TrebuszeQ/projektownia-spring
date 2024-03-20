package org.projektownia_spring.repositories;

import org.projektownia_spring.models.Role;

public interface RoleRepository {
    Iterable<Role> findAll();
    Role findById(int id);
}
