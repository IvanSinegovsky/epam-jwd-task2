package by.tc.task01.service;

import by.tc.task01.appliance.Appliance;
import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.ApplianceDAOImpl;

import java.io.IOException;
import java.util.List;

public class ApplianceService {
    private final ApplianceDAO applianceDAO = new ApplianceDAOImpl();

    public Appliance findTheCheapest() throws IOException {
        return applianceDAO.findTheCheapest();
    }

    private List<Appliance> findByName(String applianceName) throws IOException {
        return applianceDAO.findByName(applianceName);
    }
}
