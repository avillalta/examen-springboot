package org.example.examen_springboot.service;

import org.example.examen_springboot.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.example.examen_springboot.dto.StatisticsDTO;
import org.springframework.stereotype.Service;

@Service
public class StatisticsItemService {

    @Autowired
    private ItemRepository itemRepository;

    // Método para obtener estadísticas de la tienda
    public StatisticsDTO getStatistics(int num) {
        // Número total de ítems
        long totalItems = itemRepository.count();

        // Número de ítems con puntuación superior a minRating
        long highRatedItems = itemRepository.countByRate(num);

        // Devolver un objeto StoreStatistics
        return new StatisticsDTO(totalItems, highRatedItems);
    }
}
