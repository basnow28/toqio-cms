package toqio.cms.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import toqio.cms.model.ItemMenuComponent;
import toqio.cms.model.ItemMenuOption;
import toqio.cms.repository.ItemMenuComponentRepository;
import toqio.cms.repository.ItemMenuOptionRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class ItemMenuService {
    @Autowired
    ItemMenuComponentRepository itemMenuComponentRepository;
    @Autowired
    ItemMenuOptionRepository itemMenuOptionRepository;

    public List<ItemMenuComponent> getSideMenuItems(){
        return itemMenuComponentRepository.findAll();
    }

    public void saveSideMenuItems(List<ItemMenuComponent> itemMenuComponents) {
        itemMenuComponentRepository.deleteAll();
        itemMenuComponentRepository.saveAll(itemMenuComponents);
    }

    public List<ItemMenuOption> getSideMenuItemsOptions() {
        return itemMenuOptionRepository.findAll();
    }

    public void saveSideMenuOptionItem(ItemMenuOption itemMenuOption) {
        itemMenuOptionRepository.save(itemMenuOption);
    }

    public ResponseEntity<HttpStatus> deleteMenuItemOption(String id) throws Exception {
        ItemMenuOption itemMenuOption = itemMenuOptionRepository.findById(id)
                .orElseThrow(
                        () -> new Exception("Item Menu with id " + id + " not found")
                );
        itemMenuOptionRepository.delete(itemMenuOption);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
