package fake_final_exam.utils;

import fake_final_exam.model.XeTai;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DocGhiFileXeTai {
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

    public static List<XeTai> docFileXeTai(String path) {
        List<String> stringList = docFile(path);
        List<XeTai> xeTaiList = new ArrayList<>();
        String[] info;
        for (String string : stringList) {
            info = string.split(",");
            xeTaiList.add(new XeTai(info[0], info[1], Integer.parseInt(info[2]), info[3],Double.parseDouble(info[5])));
        }
        return xeTaiList;
    }

    public static void ghiFile(String path, String data) {
        try {
            File file = new File(path);
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(data);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void ghiFileXeTai(String path, List<XeTai> xeTaiList) {
        StringBuilder data = new StringBuilder();
        for (XeTai xeTai :xeTaiList) {
            data.append(xeTai.getInfor());
        }
        ghiFile(path, data.toString());
    }
}
