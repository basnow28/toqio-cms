package toqio.cms.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import toqio.cms.controller.DashboardController;
import toqio.cms.model.DashboardComponent;
import toqio.cms.repository.DashboardRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class DashboardService {
    @Autowired
    DashboardRepository dashboardRepository;


    public List<DashboardComponent> getDashboard() {
        return dashboardRepository.findAll();
    }

    public void saveDashboardComponents(List<DashboardComponent> dashboardComponents) {
        dashboardRepository.deleteAll();
        dashboardRepository.saveAll(dashboardComponents);
    }
}
