package BridgeLabz_2115000744;

import java.io.*;
import java.util.*;

class Student {
    String id, name;
    int age;

    public Student(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age;
    }
}

public class CSVToObjects {
    public static void main(String[] args) {
        String inputFile = "students.csv";
        List<Student> students = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            br.readLine(); // Skip header
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                students.add(new Student(data[0], data[1], Integer.parseInt(data[2])));
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        students.forEach(System.out::println);
    }
}
