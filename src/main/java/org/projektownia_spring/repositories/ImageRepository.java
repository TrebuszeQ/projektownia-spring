package org.projektownia_spring.repositories;


import org.projektownia_spring.models.Image;

public interface ImageRepository {
    Iterable<Image> findAll();
    Image findById(int id);
}
