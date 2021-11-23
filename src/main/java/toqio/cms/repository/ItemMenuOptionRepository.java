package toqio.cms.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import toqio.cms.model.ItemMenuOption;

import java.util.Optional;

public interface ItemMenuOptionRepository extends MongoRepository<ItemMenuOption, String> {
    Optional<ItemMenuOption> deleteById(int id);
}
