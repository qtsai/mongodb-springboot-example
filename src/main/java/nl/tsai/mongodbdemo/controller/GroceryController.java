package nl.tsai.mongodbdemo.controller;

import nl.tsai.mongodbdemo.model.GroceryItem;
import nl.tsai.mongodbdemo.repository.ItemMongoTemplateRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GroceryController {

    private final ItemMongoTemplateRepository itemRepository;

    public GroceryController(ItemMongoTemplateRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @GetMapping("/groceries")
    public List<GroceryItem> allGroceries() {
        return itemRepository.findAll();
    }

}
