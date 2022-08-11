package casestudy_furamaresort.until;

import casestudy_furamaresort.models.person_inheritance.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public static List<Employee> readEmployeeFile(String filePath) {
        List<Employee> employees = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(filePath);
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String temp[];
            Employee employee;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                int id = Integer.parseInt(temp[0]);
                int idCard = Integer.parseInt(temp[1]);
                int phoneNumber = Integer.parseInt(temp[2]);
                String name = temp[3];
                String birthDay = temp[4];
                String sex = temp[5];
                String email = temp[6];
                String academicLevel = temp[7];
                String position = temp[8];
                double salary = Double.parseDouble(temp[9]);
                employee = new Employee(id, name, birthDay, sex, idCard, phoneNumber, email, academicLevel, position, salary);
                employees.add(employee);
                for (Employee employeeList : employees) {
                    System.out.println(employeeList);
                }
            }
        } catch (Exception e) {
            System.err.println("File not found or ERROR!");
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return employees;
    }
}
