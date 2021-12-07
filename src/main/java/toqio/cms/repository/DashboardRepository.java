package toqio.cms.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import toqio.cms.model.DashboardComponent;

public interface DashboardRepository extends MongoRepository<DashboardComponent, String> {

}
