package org.example.examen_springboot.repository;

import org.example.examen_springboot.model.Item;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface ItemRepository extends MongoRepository<Item, String> {
    Optional<Item> findById(Long id);
    Optional<Item> deleteById(Long id);
    List<Item> findByCategory(String category);
    long countByRate(int num);

}
