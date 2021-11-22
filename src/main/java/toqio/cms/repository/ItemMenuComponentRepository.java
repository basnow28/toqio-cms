package toqio.cms.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import toqio.cms.model.ItemMenuComponent;

import java.util.List;

public interface ItemMenuComponentRepository extends MongoRepository<ItemMenuComponent, String> {
    public List<ItemMenuComponent> findAll();
}
