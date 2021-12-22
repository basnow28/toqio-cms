package toqio.cms.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import toqio.cms.model.DashboardComponents;

public interface DashboardComponentsRepository extends MongoRepository<DashboardComponents, String> {

}