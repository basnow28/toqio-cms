package toqio.cms.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import toqio.cms.model.DashboardComponent;
import toqio.cms.model.DashboardComponents;
import toqio.cms.repository.DashboardComponentsRepository;
import toqio.cms.repository.DashboardOptionsRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class DashboardService {
    @Autowired
    DashboardComponentsRepository dashboardRepository;
    @Autowired
    DashboardOptionsRepository dashboardOptionsRepository;


    public List<DashboardComponents> getDashboard() {
        return dashboardRepository.findAll();
    }

    public void saveDashboardComponents(List<DashboardComponents> dashboardComponents) {
        dashboardRepository.deleteAll();
        dashboardRepository.saveAll(dashboardComponents);
    }

    public List<DashboardComponent> getDashboardOptions() {
        return dashboardOptionsRepository.findAll();
    }
}
