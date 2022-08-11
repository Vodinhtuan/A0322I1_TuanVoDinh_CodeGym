package fake_final_exam.utils;

import fake_final_exam.model.XeMay;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DocGhiFileXeMay {
    public static List<String> docFile(String path) {
        List<String> stringList = new ArrayList<>();
        try {
            File file = new File(path);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                stringList.add(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }

    public static List<XeMay> docFileXeMay(String path) {
        List<String> stringList = docFile(path);
        List<XeMay> xeMayList = new ArrayList<>();
        String[] info;
        for (String string : stringList) {
            info = string.split(",");
            xeMayList.add(new XeMay(info[0], info[1], Integer.parseInt(info[2]), info[3],
                    Integer.parseInt(info[4])));
        }
        return xeMayList;
    }

    public static void ghiFile(String path, String data) {
        try {
            File file = new File(path);
            FileWriter fileWriter = new FileWriter(file,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(data);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void ghiFileXeMay(String path, List<XeMay> xeMayList) {
        StringBuilder data = new StringBuilder();
        for (XeMay xeMay :xeMayList) {
            data.append(xeMay.getInfor());
        }
        ghiFile(path, data.toString());
    }
}
