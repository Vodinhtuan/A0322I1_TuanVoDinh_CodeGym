package ss16_IO_text_file.pracice;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class demo1 {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("Hello.txt");
            writer.write("Hello!");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
