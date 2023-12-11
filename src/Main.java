import com.example.tool.appliance.Generator;
import com.example.tool.appliance.GeneratorBuilder;
import com.example.tool.type.ElectricTool;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Generator generator = new GeneratorBuilder().createGenerator();
        generator.industrialUsage();
        ElectricTool electricTool = new ElectricTool();
        electricTool.industrialUsage();
    }
}