package org.epam.task2;

public enum Appliances {
    OVEN("Oven"),
    LAPTOP("Laptop"),
    REFRIGERATOR("Refrigerator"),
    VACUUM_CLEANER("VacuumCleaner"),
    TABLET_PC("TabletPC"),
    SPEAKERS("Speakers"),
    KETTLE("Kettle");

    private String applianceNameToFile;

    Appliances(String applianceNameToFile) {
        this.applianceNameToFile = applianceNameToFile;
    }

    public String getApplianceNameToFile() {
        return this.applianceNameToFile;
    }
}
