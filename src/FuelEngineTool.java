public class FuelEngineTool extends Tool{
   private short housePower;
   private String typeOfFuel;
   private short tankCapacity;
   private short engineVolume;
   private String engineStartup; // hand / electric starter

   public short getHousePower() {
      return housePower;
   }

   public void setHousePower(short housePower) {
      this.housePower = housePower;
   }

   public String getTypeOfFuel() {
      return typeOfFuel;
   }

   public void setTypeOfFuel(String typeOfFuel) {
      this.typeOfFuel = typeOfFuel;
   }

   public short getTankCapacity() {
      return tankCapacity;
   }

   public void setTankCapacity(short tankCapacity) {
      this.tankCapacity = tankCapacity;
   }

   public short getEngineVolume() {
      return engineVolume;
   }

   public void setEngineVolume(short engineVolume) {
      this.engineVolume = engineVolume;
   }

   public String getEngineStartup() {
      return engineStartup;
   }

   public void setEngineStartup(String engineStartup) {
      this.engineStartup = engineStartup;
   }

   public FuelEngineTool(String name, double price, short housePower, String typeOfFuel, short tankCapacity, short engineVolume, String engineStartup) {
      super(name, price);
      this.housePower = housePower;
      this.typeOfFuel = typeOfFuel;
      this.tankCapacity = tankCapacity;
      this.engineVolume = engineVolume;
      this.engineStartup = engineStartup;
   }

   public FuelEngineTool() {
   }

   @Override
   public void sound() {
   }
}
