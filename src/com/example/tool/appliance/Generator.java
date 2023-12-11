package com.example.tool.appliance;

import com.example.tool.type.FuelEngineTool;
import com.example.tool.use.Industrial;

public class Generator extends FuelEngineTool implements Industrial {
    private double ratedOutPower;
    private double maxOutPower;
    private String alternatorType;   //synch / asynch
    private short outVoltage;
    private String cooling;

    public double getRatedOutPower() {
        return ratedOutPower;
    }

    public void setRatedOutPower(double ratedOutPower) {
        this.ratedOutPower = ratedOutPower;
    }

    public double getMaxOutPower() {
        return maxOutPower;
    }

    public void setMaxOutPower(double maxOutPower) {
        this.maxOutPower = maxOutPower;
    }

    public String getAlternatorType() {
        return alternatorType;
    }

    public void setAlternatorType(String alternatorType) {
        this.alternatorType = alternatorType;
    }

    public short getOutVoltage() {
        return outVoltage;
    }

    public void setOutVoltage(short outVoltage) {
        this.outVoltage = outVoltage;
    }

    public String getCooling() {
        return cooling;
    }

    public void setCooling(String cooling) {
        this.cooling = cooling;
    }

    public Generator(String name, double price, short housePower, String typeOfFuel, short tankCapacity, short engineVolume, String engineStartup, double ratedOutPower, double maxOutPower, String alternatorType, short outVoltage, String cooling) {
        super(name, price, housePower, typeOfFuel, tankCapacity, engineVolume, engineStartup);
        this.ratedOutPower = ratedOutPower;
        this.maxOutPower = maxOutPower;
        this.alternatorType = alternatorType;
        this.outVoltage = outVoltage;
        this.cooling = cooling;
    }

    public Generator() {
    }

    public Generator(double maxOutPower) {
        this.maxOutPower = maxOutPower;
    }

    @Override
      public void sound() {
            System.out.println("Ron-don-don)))");
  }

    @Override
    public void industrialUsage() {
        System.out.println("Yes, it's industrial");
    }

    @Override
    public String toString() {
        return "Generator{" +
                "ratedOutPower=" + ratedOutPower +
                ", maxOutPower=" + maxOutPower +
                ", alternatorType='" + alternatorType + '\'' +
                ", outVoltage=" + outVoltage +
                ", cooling='" + cooling + '\'' +
                '}';
    }
}
