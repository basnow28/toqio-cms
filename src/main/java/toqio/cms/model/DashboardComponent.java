package toqio.cms.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("dashboard")
public class DashboardComponent {
    @Id
    private String id;
    private String component;
}
