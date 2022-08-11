package ss16_IO_text_file.exercise;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    private int id;
    private String code, name;

    public ReadFile() {
    }

    public ReadFile(int id, String code, String name) {
        this.id = id;
        this.code = code;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ReadFile{ " +
                "id= " + id +
                ", code= '" + code + '\'' +
                ", name= '" + name + '\'' +
                '}';
    }

    public static List<String> parseCsvLine(String csvLine) {
        List<String> result = new ArrayList<>();
        if (csvLine != null) {
            String[] splitData = csvLine.split(",");
            for (int i = 0; i < splitData.length; i++) {
                result.add(splitData[i]);
            }
        }
        return result;
    }

    private static void printCountry(List<String> coutry) {
        System.out.println("id= " + coutry.get(0) +
                ", code= '" + coutry.get(1) +
                ", name= '" + coutry.get(2) +
                '}');
    }

    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        try {
            String line;
            bufferedReader = new BufferedReader(new FileReader("F:\\CodeGym\\Module_2\\src\\ss16_IO_text_file\\exercise\\ode.csv"));
            while ((line = bufferedReader.readLine()) != null){
                printCountry(parseCsvLine(line));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (bufferedReader != null){
                    bufferedReader.close();
                }
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
