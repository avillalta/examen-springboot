package org.example.examen_springboot.dto;

public class StatisticsDTO {
    private long totalItems;
    private long highRatedItems;

    // Constructor
    public StatisticsDTO(long totalItems, long highRatedItems) {
        this.totalItems = totalItems;
        this.highRatedItems = highRatedItems;
    }

    // Getters
    public long getTotalItems() {
        return totalItems;
    }

    public long getHighRatedItems() {
        return highRatedItems;
    }
}
