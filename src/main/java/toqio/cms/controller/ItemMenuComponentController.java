package toqio.cms.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import toqio.cms.model.ItemMenuComponent;
import toqio.cms.service.ItemMenuComponentService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/sideMenu")
@AllArgsConstructor
public class ItemMenuComponentController {
    private ItemMenuComponentService itemMenuComponentService;
    @GetMapping
    public List<ItemMenuComponent> getMenuItems(){
        return itemMenuComponentService.getSideMenuItems();
    }

    @PostMapping
    public void postMenuItems(@RequestBody List<ItemMenuComponent> itemMenuComponents){
        itemMenuComponentService.saveSideMenuItems(itemMenuComponents);
    }

}
