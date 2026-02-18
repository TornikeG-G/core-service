package city.lostfound.core_service.item.core.impl;


import city.lostfound.core_service.item.core.ItemService;
import city.lostfound.core_service.item.domain.entities.Item;
import city.lostfound.core_service.item.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    private final ItemRepository itemRepository;

    @Autowired
    public ItemServiceImpl(final ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @Override
    public Item save(Item item) {
        return itemRepository.save(item);
    }

    @Override

    public List<Item> findAll() {
        return itemRepository.findAll();
    }
}

