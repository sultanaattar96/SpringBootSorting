package com.example.items.controller;

import com.example.items.model.Item;
import com.example.items.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController {

    @Autowired
    private ItemService service;

    @GetMapping
    public List<Item> getItems(
            @RequestParam(required = false) String sortField,
            @RequestParam(required = false) String sortOrder) {
        return service.getAllItems(sortField, sortOrder);
    }


    @PostMapping
    public String addItem(@RequestBody Item item) {
        service.addItem(item);
        return "Item added successfully!";
    }
}
