package toqio.cms.controller;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import toqio.cms.model.DashboardComponent;
import toqio.cms.model.DashboardComponents;
import toqio.cms.service.DashboardService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/dashboard")
@AllArgsConstructor
public class DashboardController {
    @Autowired
    DashboardService dashboardService;
    /*
     * GET DASHBOARD COMPONENTS
     * */
    @GetMapping
    public ResponseEntity<List<DashboardComponents>> getDashboard(){
        return new ResponseEntity(dashboardService.getDashboard(), HttpStatus.OK);
    }
    /*
     * POST DASHBOARD COMPONENTS
     * */
    @PostMapping
    public void postDashboard(@RequestBody List<DashboardComponents> dashboardComponents){
        dashboardService.saveDashboardComponents(dashboardComponents);
    }
    /*
    * GET DASHBOARD COMPONENTS OPTIONS
    * */
    @GetMapping("/options")
    public ResponseEntity<List<DashboardComponent>> getDashboardOptions(){
        return new ResponseEntity(dashboardService.getDashboardOptions(), HttpStatus.OK);
    }

}
