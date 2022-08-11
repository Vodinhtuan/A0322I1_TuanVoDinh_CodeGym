package ss17_IO_binary_file_serialization.exercise.product_management;

import ss17_IO_binary_file_serialization.exercise.product_management.Items;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SavaBinaryFile {
    public static void main(String[] args) {
        try {
            do {
                Scanner scanner = new Scanner(System.in);
                List<Items> items = readFile("F:\\CodeGym\\Module_2\\src\\ss17_IO_binary_file_serialization\\exercise\\items.txt");
                System.out.println("Menu:");
                System.out.println("1 to add.");
                System.out.println("2 to display list product.");
                System.out.println("3 to Exit.");
                int select = Integer.parseInt(scanner.nextLine());
                switch (select) {
                    case 1:
                        System.out.print("Input id product: ");
                        int id = Integer.parseInt(scanner.nextLine());
                        System.out.print("Input name product: ");
                        String name = scanner.nextLine();
                        System.out.print("Input brand product: ");
                        String brand = scanner.nextLine();
                        System.out.print("Input description product: ");
                        String desc = scanner.nextLine();
                        System.out.print("Input price product: ");
                        double price = Double.parseDouble(scanner.nextLine());
                        items.add(new Items(id, name, brand, desc, price));
                        System.out.println("Write to file");
                        writeToFile("F:\\CodeGym\\Module_2\\src\\ss17_IO_binary_file_serialization\\exercise\\items.txt", items);
                        break;
                    case 2:
                        listItems(items);
                        break;
                    case 3:
                        System.exit(0);
                }
            } while (true);
        } catch (Exception e) {
            System.err.println("Exception " + e.getMessage());
        }
    }

    public static List<Items> readFile(String FilePath) {
        List<Items> items = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(FilePath);
            ObjectInputStream ois = new ObjectInputStream(fis);
            items = (List<Items>) ois.readObject();
            fis.close();
            ois.close();
        } catch (Exception e) {
            System.err.println("Exception " + e.getMessage());
        }
        return items;
    }

    public static void writeToFile(String filePath, List<Items> items) {
        try {
            FileOutputStream fos = new FileOutputStream(filePath);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(items);
            fos.close();
            oos.close();
        } catch (Exception e) {
            System.err.println("Exception " + e.getMessage());
        }
    }

    public static void listItems(List<Items> list) {
        System.out.println("List Items: ");
        for (Items items : list) {
            System.out.println(items);
        }
    }
}