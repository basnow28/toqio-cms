package toqio.cms.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import toqio.cms.model.ItemMenuComponent;
import toqio.cms.model.ItemMenuOption;
import toqio.cms.service.ItemMenuService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/sideMenu")
@AllArgsConstructor
public class ItemMenuComponentController {
    @Autowired
    ItemMenuService itemMenuService;

    /*
    * GET SIDE MENU COMPONENTS LIST
    * */
    @GetMapping
    public ResponseEntity<List<ItemMenuComponent>> getMenuItems(){
        return new ResponseEntity<>(itemMenuService.getSideMenuItems(), HttpStatus.OK);
    }
    /*
     * POST NEW SIDE MENU COMPONENTS LIST
     * */
    @PostMapping
    public void postMenuItems(@RequestBody List<ItemMenuComponent> itemMenuComponents){
        itemMenuService.saveSideMenuItems(itemMenuComponents);
    }


    /*
     * GET SIDE MENU AVAILABLE COMPONENTS LIST
     * */
    @GetMapping("/options")
    public ResponseEntity<List<ItemMenuOption>> getMenuItemsOptions(){
        return  new ResponseEntity<>(itemMenuService.getSideMenuItemsOptions(), HttpStatus.OK);
    }
    /*
     * POST A NEW COMPONENT TO AVAILABLE OPTIONS LIST
     * */
    @PostMapping("/options")
    public void postItemMenuOption(@RequestBody ItemMenuOption itemMenuOption){
        itemMenuService.saveSideMenuOptionItem(itemMenuOption);
    }
    @DeleteMapping("/options/{id}")
    public ResponseEntity<HttpStatus> deleteMenuItemOption(@PathVariable String id) throws Exception {
        return itemMenuService.deleteMenuItemOption(id);
    }
}
