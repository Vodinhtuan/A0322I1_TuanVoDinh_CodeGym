package ss16_IO_text_file.exercise;

import java.io.*;
import java.nio.file.FileAlreadyExistsException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CopyFileText {
    public List<String> readFile(String filePath){
        List<String> strings  = new ArrayList<>();
        try {
            File file = new File(filePath);
            if(!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line ="";
            while ((line = bufferedReader.readLine())!=null){
                System.out.println(line);
                strings.add(line);
            }
            bufferedReader.close();
        }catch (Exception e){
            System.out.println("File not found!");
        }finally {
            System.out.println("Read file done!");
        }
        return strings;
    }
    public void writeFile(String filePath, List<String> string){
        try {
            FileWriter fileWriter = new FileWriter(filePath,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (String value: string) {
                bufferedWriter.write(value);
                bufferedWriter.newLine();
            }
        bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            System.out.println("Copy file done!");
        }
    }
    public void copyByte(String filePath, String filePathTaget){
        writeFile(filePath,readFile(filePathTaget));
    }

    public static void main(String[] args) {
        CopyFileText copyFileText = new CopyFileText();
        copyFileText.copyByte("F:\\CodeGym\\Module_2\\source.txt","F:\\CodeGym\\Module_2\\target.txt");


        /*try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("target.txt"));
            BufferedReader br = new BufferedReader(new FileReader("source.txt"));
            String s;
            while ((s = br.readLine()) != null) {
                bw.write(s + "\n");
            }
            br.close();
            bw.close();
        } catch (Exception ex) {
            System.out.println("File not found or File is exists!");
        }*/
    }
}
