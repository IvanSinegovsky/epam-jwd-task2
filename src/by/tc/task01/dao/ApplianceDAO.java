package by.tc.task01.dao;

import by.tc.task01.appliance.Appliance;

import java.io.IOException;
import java.util.List;

public interface ApplianceDAO {
    List<Appliance> findByName(String applianceName) throws IOException;
    public Appliance findTheCheapest() throws IOException;
    void write(Appliance appliance) throws IOException;
}
