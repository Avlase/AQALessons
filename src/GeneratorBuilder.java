public class GeneratorBuilder {
    private String name;
    private double price;
    private short housePower;
    private String typeOfFuel;
    private short tankCapacity;
    private short engineVolume;
    private String engineStartup;
    private double ratedOutPower;
    private double maxOutPower;
    private String alternatorType;
    private short outVoltage;
    private String cooling;

    public GeneratorBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public GeneratorBuilder setPrice(double price) {
        this.price = price;
        return this;
    }

    public GeneratorBuilder setHousePower(short housePower) {
        this.housePower = housePower;
        return this;
    }

    public GeneratorBuilder setTypeOfFuel(String typeOfFuel) {
        this.typeOfFuel = typeOfFuel;
        return this;
    }

    public GeneratorBuilder setTankCapacity(short tankCapacity) {
        this.tankCapacity = tankCapacity;
        return this;
    }

    public GeneratorBuilder setEngineVolume(short engineVolume) {
        this.engineVolume = engineVolume;
        return this;
    }

    public GeneratorBuilder setEngineStartup(String engineStartup) {
        this.engineStartup = engineStartup;
        return this;
    }

    public GeneratorBuilder setRatedOutPower(double ratedOutPower) {
        this.ratedOutPower = ratedOutPower;
        return this;
    }

    public GeneratorBuilder setMaxOutPower(double maxOutPower) {
        this.maxOutPower = maxOutPower;
        return this;
    }

    public GeneratorBuilder setAlternatorType(String alternatorType) {
        this.alternatorType = alternatorType;
        return this;
    }

    public GeneratorBuilder setOutVoltage(short outVoltage) {
        this.outVoltage = outVoltage;
        return this;
    }

    public GeneratorBuilder setCooling(String cooling) {
        this.cooling = cooling;
        return this;
    }

    public Generator createGenerator() {
        return new Generator(name, price, housePower, typeOfFuel, tankCapacity, engineVolume, engineStartup, ratedOutPower, maxOutPower, alternatorType, outVoltage, cooling);
    }
}