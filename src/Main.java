import com.example.tool.appliance.ElectricSaw;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private static final String FILE_NAME = "resources/electricSaw.csv";

    static String[] readFileUsingBufferReader(String filename) {
        ArrayList<String> data = new ArrayList<String>();
        FileReader reader;
        try {
            reader = new FileReader(filename);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        var br = new BufferedReader(reader);
        String newLine;

        try {
            while ((newLine = br.readLine()) != null) {
                data.add(newLine);
             }
            reader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return Arrays.copyOf(data.toArray(), data.size(), String[].class);
    }
    public static void main(String[] args) {

    String[] data = readFileUsingBufferReader(FILE_NAME);
    for (int c = 1; c < data.length; c++){
        ElectricSaw electricSaw = null;
        var piece = data[c].split( ";");
        electricSaw = new ElectricSaw(Short.parseShort(piece[0]), piece[1], Short.parseShort(piece[2]), piece[3], Short.parseShort(piece[4]));
        System.out.println(electricSaw);
    }

    }
}