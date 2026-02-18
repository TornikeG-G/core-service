package city.lostfound.core_service.item.repository;

import city.lostfound.core_service.item.domain.entities.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
