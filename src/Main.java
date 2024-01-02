import com.example.tool.appliance.ElectricSaw;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Year;
import java.time.format.DateTimeFormatter;
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
            var start = System.currentTimeMillis();
            String[] data = readFileUsingBufferReader(FILE_NAME);
            var dur1 = System.currentTimeMillis() - start;
            System.out.println("Duration(read file) " + dur1);
            System.out.println("----------------");
            var start2 = System.currentTimeMillis();
            electricSaws = addSaw(data);
            var dur2 = System.currentTimeMillis() - start2;
            System.out.println("Parse data and add object " + dur2);
            System.out.println("----------------");
            var start3 = System.currentTimeMillis();

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

            var dur3 = System.currentTimeMillis() - start3;
            System.out.println("----------------");
            System.out.println("Streams duration " + dur3);
            System.out.println("----------------");

            List<Integer> duration = new ArrayList<>();
            duration.add((int)dur1);
            duration.add((int)dur2);
            duration.add((int)dur3);

            Collections.sort(duration);
            System.out.println("Sorted durations " + duration);

            var date1 = new Date(2023, Calendar.NOVEMBER, 15, 22, 10);
            var date2 = new Date(2024, Calendar.APRIL, 11, 21, 15);
            var dif = (date2.getTime()-date1.getTime()) / (24*3600000);
            System.out.println("The difference between " + date1.getDate() + "." + date1.getMonth() + "." + date1.getYear() + " " + date1.getHours() + ":" + date1.getMinutes() +
                    " and " + date2.getDate() + "." + date2.getMonth() + "." + date2.getYear() + " " + date2.getHours() + ":" + date2.getMinutes() + " is " + dif + "days");
        }
    }