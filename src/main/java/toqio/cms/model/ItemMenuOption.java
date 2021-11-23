package toqio.cms.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document(collection = "sideMenuOptions")
public class ItemMenuOption {
    @Id
    private String id;
    private String text;
    private String icon;
    @Indexed
    private String to;
    private List<Logic> logic;
}
