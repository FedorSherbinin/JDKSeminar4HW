import java.util.ArrayList;
import java.util.List;

public class Employee {
    private int id;              // Табельный номер
    private String phoneNumber;  // Номер телефона
    private String name;         // Имя
    private int experience;      // Стаж

    public Employee(int id, String phoneNumber, String name, int experience) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.experience = experience;
    }

    public int getId() {
        return id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return "Табельный номер: " + id + ", Имя: " + name + ", Телефон: " + phoneNumber + ", Стаж: " + experience;
    }
}

