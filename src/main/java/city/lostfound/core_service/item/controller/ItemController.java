package city.lostfound.core_service.item.controller;

import city.lostfound.core_service.item.core.ItemService;
import city.lostfound.core_service.item.domain.entities.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController {

    private final ItemService itemService;

    @Autowired
    public ItemController(final ItemService itemService) {
        this.itemService = itemService;
    }

    @PostMapping
    public Item create(@RequestBody Item item) {
        return itemService.save(item);
    }

    @GetMapping
    public List<Item> getAll() {
        return itemService.findAll();
    }
}

