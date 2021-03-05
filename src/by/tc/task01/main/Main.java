package by.tc.task01.main;

import by.tc.task01.dao.ApplianceDAOImpl;
import by.tc.task01.service.ApplianceService;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ApplianceService service = new ApplianceService();

        try {
            System.out.println(service.findTheCheapest());
        } catch (IOException e) {
            System.out.println("Something went wrong with application... Please, try again later.");;
        }
    }
}
