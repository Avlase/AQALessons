import com.example.tool.appliance.ElectricSaw;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Stream;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private static final String FILE_NAME = "resources/electricSawUpd.csv";

    static String[] readFileUsingBufferReader(String filename) {
        ArrayList<String> data = new ArrayList<>();
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
    private static Vector<ElectricSaw> addSaw(String[] data) {
        Vector<ElectricSaw> electricSawList = new Vector<>();
        for (int c = 1; c < data.length; c++) {
            ElectricSaw electricSaw = null;
            var piece = data[c].split(";");
            electricSaw = new ElectricSaw(Short.parseShort(piece[0]), Short.parseShort(piece[1]), piece[2], Short.parseShort(piece[3]), piece[4], Short.parseShort(piece[5]));
            electricSawList.add(electricSaw);
        }
        return electricSawList;
    }
        public static void main (String[]args){
            Vector<ElectricSaw> electricSaws = new Vector<>();
            String[] data = readFileUsingBufferReader(FILE_NAME);
            electricSaws = addSaw(data);

            Stream<ElectricSaw> stream = electricSaws.stream();

            stream
                  //  .filter(electricSaw-> electricSaw.getPower() > 1600)
                    .sorted((d1, d2)->(int) (d1.getPower()*1000 - d2.getPower()*1000))
                    .skip(14)
                    .limit(21)
                    .forEach(System.out::println);

            System.out.println("----------------");

            Stream<ElectricSaw> stream2 = electricSaws.stream();

            stream2
                    .filter(electricSaw -> electricSaw.getVoltage() < 220)
                    .limit(6)
                    .forEach(System.out::println);

            System.out.println("----------------");

            Stream<ElectricSaw> stream3 = electricSaws.stream();

            stream3
                    .map(electricSaw -> "ID " + electricSaw.getId() + " | Disk - " + electricSaw.getDiskDia() + " | Power - " + electricSaw.getPower() + " | Type Of Power - " + electricSaw.getTypeOfPower()
                    + " | Engine Type - " + electricSaw.getEngineType() + " | Voltage - " + electricSaw.getVoltage())
                    .forEach(System.out::println);
        }
    }