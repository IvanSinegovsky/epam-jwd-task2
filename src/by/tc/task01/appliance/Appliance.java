package by.tc.task01.appliance;

import java.util.List;

public class Appliance {
    private String applianceName;
    private List<String> applianceProperties;

    public Appliance() {
    }

    public Appliance(String applianceName, List<String> applianceProperties) {
        this.applianceName = applianceName;
        this.applianceProperties = applianceProperties;
    }

    public void setApplianceName(String applianceName) {
        this.applianceName = applianceName;
    }

    public void setApplianceProperties(List<String> applianceProperties) {
        this.applianceProperties = applianceProperties;
    }

    @Override
    public String toString() {
        return "Appliance{" +
                "applianceName='" + applianceName + '\'' +
                ", applianceProperties=" + applianceProperties +
                '}';
    }

    public String toFileWrite() {
        StringBuilder appliancePropertiesToFileFormat = new StringBuilder();

        for (int i = 0; i < applianceProperties.size() - 1; i++) {
            appliancePropertiesToFileFormat.append(applianceProperties.get(i)).append(" , ");
        }
        appliancePropertiesToFileFormat.append(
                applianceProperties.get(applianceProperties.size() - 1)
        );

        return applianceName + " : " + appliancePropertiesToFileFormat;
    }

    public double getPrice() {
        return Double.parseDouble(
                applianceProperties.get(
                        applianceProperties.size() - 1)
                        .split("=")[1]
        );
    }
}
