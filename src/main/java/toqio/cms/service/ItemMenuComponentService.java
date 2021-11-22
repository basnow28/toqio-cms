package toqio.cms.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import toqio.cms.model.ItemMenuComponent;
import toqio.cms.repository.ItemMenuComponentRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class ItemMenuComponentService  {
    private ItemMenuComponentRepository itemMenuComponentRepository;
    public List<ItemMenuComponent> getSideMenuItems(){
        return itemMenuComponentRepository.findAll();
    }

    public void saveSideMenuItems(List<ItemMenuComponent> itemMenuComponents) {
        itemMenuComponentRepository.deleteAll();
        itemMenuComponentRepository.saveAll(itemMenuComponents);
    }
}
