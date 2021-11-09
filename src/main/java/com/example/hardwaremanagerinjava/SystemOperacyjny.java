package com.example.hardwaremanagerinjava;

import oshi.SystemInfo;
import oshi.software.os.OperatingSystem;

public class SystemOperacyjny {
    public static void main(String... args) {
        SystemInfo systemInfo = new SystemInfo();
        OperatingSystem operatingSystem = systemInfo.getOperatingSystem();
        OperatingSystem.OSVersionInfo versionInfo = operatingSystem.getVersionInfo();
        System.out.println("Operating System: " + operatingSystem);
        System.out.println("Family: " + operatingSystem.getFamily());
        System.out.println("Manufacturer: " + operatingSystem.getManufacturer());
        System.out.println("Number of bits supported by the OS (32 or 64): " + operatingSystem.getBitness());
        System.out.println("Version: " + versionInfo.getVersion());
        System.out.println("CodeName: " + versionInfo.getCodeName());
        System.out.println("Build Number: " + versionInfo.getBuildNumber());
    }
}
