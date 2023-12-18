package com.example.tool.appliance;

import com.example.tool.type.ElectricTool;

import java.util.StringJoiner;

public class ElectricSaw extends ElectricTool {
   private short diskDia;
    public short getDiskDia() {
        return diskDia;
    }

    public void setDiskDia(short diskDia) {
        this.diskDia = diskDia;
    }

    public ElectricSaw(short diskDia, String typeOfPower, short power, String engineType, short voltage) {
        super(typeOfPower, power, engineType, voltage);
        this.diskDia = diskDia;
    }

    public ElectricSaw(String name, double price, short diskDia) {
        super(name, price);
        this.diskDia = diskDia;
    }
    public ElectricSaw(short diskDia) {
        this.diskDia = diskDia;
    }

    @Override
    public String toString() {
        return "ElectricSaw{" +
                "diskDia=" + diskDia +
                "} " + super.toString();
    }

    @Override
    public void industrialUsage() {
        super.industrialUsage();
    }
}
