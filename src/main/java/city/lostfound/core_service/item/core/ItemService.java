package city.lostfound.core_service.item.core;

import city.lostfound.core_service.item.domain.entities.Item;

import java.util.List;

public interface ItemService {
    Item save(Item item);

    List<Item> findAll();
}
