package toqio.cms.model;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigInteger;
import java.util.List;

@Data
@Document(collection = "sideMenu")
public class ItemMenuComponent {
    @Id
    private String id;
    @Indexed
    private BigInteger ordinalNumber;
    private String text;
    private String icon;
    private String to;
    private List<Logic> logic;
}
