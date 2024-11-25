package com.example.items.service;

import com.example.items.model.Item;
import com.example.items.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    private ItemRepository repository;

    public List<Item> getAllItems(String sortField, String sortOrder) {
        // Default to sorting by "id" in ascending order
        sortField = (sortField == null || sortField.isEmpty()) ? "id" : sortField;
        sortOrder = (sortOrder == null || sortOrder.isEmpty()) ? "asc" : sortOrder.toLowerCase();
        //sortOrder = (sortOrder == null || sortOrder.isEmpty()) ? "desc" : sortOrder.toUpperCase(null));

        Sort sort = Sort.by(Sort.Direction.fromString(sortOrder), sortField);
        return repository.findAll(sort);
    }


    public void addItem(Item item) {
        repository.save(item); // JpaRepository's built-in save method
    }
}

