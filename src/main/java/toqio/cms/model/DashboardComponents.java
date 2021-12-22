package toqio.cms.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Data
@Document(collection = "dashboardComponents")
public class DashboardComponents {
    @Id
    private String id;
    private String style;
    private ArrayList<DashboardComponent> components;
}
