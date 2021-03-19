package by.tc.task01.dao;

import by.tc.task01.appliance.Appliance;

import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ApplianceDAOImpl implements ApplianceDAO {// определялось, что в результате вы должны создать объект-электроприбор определенного типа - т.е.в оспользоваться фабрикой, билдером..... Т.е. условие задание не выполнено
    private final File appliancesDb = Paths.get("appliances_db.txt").toFile();

    @Override
    public List<Appliance> findByName(String applianceName) throws IOException {
        FileReader fr = new FileReader(appliancesDb);
        BufferedReader reader = new BufferedReader(fr);
        String line = reader.readLine();
        List<Appliance> correctAppliances = new ArrayList<>();

        while (line != null) {
            String[] applianceNameFromFile = line.split(":");

            if (applianceName.equals(applianceNameFromFile[0].trim())) {
                correctAppliances.add(stringToAppliance(line));
            }

            line = reader.readLine();
        }

        fr.close();// эти методы вызываются только в блоке finally
        reader.close();

        return correctAppliances;
    }

    @Override
    public Appliance findTheCheapest() throws IOException {
        FileReader fr = new FileReader(appliancesDb);
        BufferedReader reader = new BufferedReader(fr);

        String line = reader.readLine();
        Appliance cheapestAppliance = stringToAppliance(line);
        Appliance currentAppliance = stringToAppliance(line);
        Double lowestPrice = currentAppliance.getPrice();

        while (line != null) {

            if (currentAppliance.getPrice() < lowestPrice) {
                lowestPrice = currentAppliance.getPrice();
                cheapestAppliance = currentAppliance;
            }

            currentAppliance = stringToAppliance(line);
            line = reader.readLine();
        }

        fr.close();
        reader.close();

        return cheapestAppliance;
    }

    @Override
    public void write(Appliance appliance) throws IOException {
        FileWriter writer = new FileWriter(appliancesDb, true);
        writer.write(appliance.toFileWrite());
    }

    private Appliance stringToAppliance(String applianceString) {
        String[] splittedString = applianceString.split(":");
        String applianceName = splittedString[0].trim();
        String[] properties = splittedString[1].split(",");

        List<String> applianceProperties = new ArrayList<>();

        for (String property : properties) {
            applianceProperties.add(property.trim());
        }

        Appliance appliance = new Appliance(applianceName, applianceProperties);

        return appliance;
    }
}
