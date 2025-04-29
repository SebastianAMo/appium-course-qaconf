package co.qaconf.utils;

import net.serenitybdd.model.environment.ConfiguredEnvironment;
import net.serenitybdd.model.environment.EnvironmentSpecificConfiguration;
import net.thucydides.model.util.EnvironmentVariables;

public class MobileHelper {

    public static String getPlatformName(){
        EnvironmentVariables variables = ConfiguredEnvironment.getEnvironmentVariables();
        return EnvironmentSpecificConfiguration
                .from(variables)
                .getProperty("appium.platformName");
    }

    public static String getCurrentEnvironment() {
        EnvironmentVariables variables = ConfiguredEnvironment.getEnvironmentVariables();
        EnvironmentSpecificConfiguration.activeEnvironmentsIn(variables);
        return variables.getProperty("environment");
    }


}