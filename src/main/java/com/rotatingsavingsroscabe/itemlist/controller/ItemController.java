package com.rotatingsavingsroscabe.itemlist.controller;

import com.rotatingsavingsroscabe.itemlist.model.Item;
import com.rotatingsavingsroscabe.itemlist.repository.ItemRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:5173") // Allow React app to call this API
@RestController
@RequestMapping("/items")
public class ItemController {

    private final ItemRepository itemRepository;

    public ItemController(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @GetMapping
    public List<Item> getAllItems() {
        return itemRepository.findAll();
    }

    @PostMapping
    public Item addItem(@RequestBody Item item) {
        return itemRepository.save(item);
    }
}
