package AWT;

import java.util.ArrayList;

public class employee_model {
    private int id;
    private String name;
    private String gender;
    private double salary;
    private String image;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public double getSalary() {
        return salary;
    }

    public String getImage() {
        return image;
    }
    
    public employee_model(int id, String name, String gender, double salary, String image) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.salary = salary;
        this.image = image;
    }
    static ArrayList<employee_model> list = new ArrayList<>();
}
