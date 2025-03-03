package org.example.examen_springboot.controller;

import org.example.examen_springboot.dto.StatisticsDTO;
import org.example.examen_springboot.model.Item;
import org.example.examen_springboot.repository.ItemRepository;
import org.example.examen_springboot.service.StatisticsItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/items")
public class ItemController {

    @Autowired
    private ItemRepository itemRepository;

    @Autowired
    private StatisticsItemService statisticsItemService;

    @GetMapping
    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Item> getItemById(@PathVariable Long id) {
        return itemRepository.findById(id);
    }

    @PostMapping
    public Item createItem(@RequestBody Item item) {
        return itemRepository.save(item);
    }

    @DeleteMapping("/{id}")
    public void deleteItem(@PathVariable Long id) {
        itemRepository.deleteById(id);
    }

    @GetMapping("/category/{category}")
    public List<Item> getItemsByCategory(@PathVariable String category) {
        return itemRepository.findByCategory(category);
    }

    @GetMapping("/statistics")
    public StatisticsDTO getStoreStatistics(@RequestParam int num) {
        return statisticsItemService.getStatistics(num);
    }
}
