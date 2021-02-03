package org.epam.task2;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Searcher {
    private File appliancesFile = new File("appliances_db.txt");


    public Searcher() {    }

    public Searcher(File appliancesFile) {
        this.appliancesFile = appliancesFile;
    }


    public void outputByName(String applianceName) {
        List<String> appliancesInfos = fileParse(applianceName);

        for (String applianceInfo : appliancesInfos) {
            System.out.println(applianceInfo);
        }
    }
/*

    public void searchTheCheapestByName(String applianceName) {

    }
*/

    private List<String> fileParse(String applianceName) {
        List<String> appliancesInfos = new ArrayList<>();

        try {
            FileReader fr = new FileReader(appliancesFile);
            Scanner scanner = new Scanner(fr);
            String applianceInfo;
            String currentLineApplianceName;

            while (scanner.hasNext()) {
                applianceInfo = scanner.nextLine();
                currentLineApplianceName = applianceInfo.substring(0, applianceName.length());

                if (currentLineApplianceName.equals(applianceName)) {
                    appliancesInfos.add(applianceInfo);
                }
            }

            fr.close();
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            return appliancesInfos;
        }
    }
/*
    private String appliancesInfosModify(String appliancesInfos) {

    }*/
}