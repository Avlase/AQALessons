public class HandTool extends Tool{
    private String steelGrade;
    private String usage; // metal/wood/concrete
    private String category; // Hummer/SAW/screwdriver
    private String grip; // plastic / wood/ gum elastic etc.
    private short weight;

    public HandTool(String name, double price) {
        super(name, price);
    }

    public String getSteelGrade() {
        return steelGrade;
    }

    public void setSteelGrade(String steelGrade) {
        this.steelGrade = steelGrade;
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getGrip() {
        return grip;
    }

    public void setGrip(String grip) {
        this.grip = grip;
    }

    public short getWeight() {
        return weight;
    }

    public void setWeight(short weight) {
        this.weight = weight;
    }
}
