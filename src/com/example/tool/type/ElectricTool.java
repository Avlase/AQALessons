package com.example.tool.type;

import com.example.tool.Tool;
import com.example.tool.use.Industrial;

import java.util.StringJoiner;

public class ElectricTool extends Tool implements Industrial {
    private String typeOfPower;
    private short power;
    private String engineType;
    private short voltage;
    private boolean speedControl;  // yes/no

    public ElectricTool(String name, double price) {
        super(name, price);
    }

    public String getTypeOfPower() {
        return typeOfPower;
    }

    public void setTypeOfPower(String typeOfPower) {
        this.typeOfPower = typeOfPower;
    }

    public short getPower() {
        return power;
    }

    public void setPower(short power) {
        this.power = power;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public short getVoltage() {
        return voltage;
    }

    public void setVoltage(short voltage) {
        this.voltage = voltage;
    }

    public boolean isSpeedControl() {
        return speedControl;
    }

    public void setSpeedControl(boolean speedControl) {
        this.speedControl = speedControl;
    }

    public ElectricTool(String typeOfPower, short power, String engineType) {
        super();
        this.typeOfPower = typeOfPower;
        this.power = power;
        this.engineType = engineType;
    }

    public ElectricTool(String typeOfPower, short power, String engineType, short voltage) {
        this.typeOfPower = typeOfPower;
        this.power = power;
        this.engineType = engineType;
        this.voltage = voltage;
    }

    public ElectricTool() {
    }

    @Override
    public void sound() {
    }
    @Override
    public void industrialUsage() {
        System.out.println("Electric industrial tool");
    }

    @Override
    public String toString() {
        return "ElectricTool{" +
                "typeOfPower='" + typeOfPower + '\'' +
                ", power=" + power +
                ", engineType='" + engineType + '\'' +
                ", voltage=" + voltage +
                ", speedControl=" + speedControl +
                '}';
    }
}
