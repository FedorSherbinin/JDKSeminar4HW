import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Пример использования справочника
        EmployeeDirectory directory = new EmployeeDirectory();

        // Добавляем сотрудников
        directory.addEmployee(new Employee(1, "123-456-7890", "Иван Иванов", 5));
        directory.addEmployee(new Employee(2, "987-654-3210", "Мария Петрова", 3));
        directory.addEmployee(new Employee(3, "555-666-7777", "Иван Иванов", 8));

        // Ищем сотрудников по стажу
        List<Employee> employeesByExperience = directory.findEmployeesByExperience(5);
        System.out.println("Сотрудники со стажем 5 лет:");
        for (Employee employee : employeesByExperience) {
            System.out.println(employee);
        }

        // Ищем номер телефона по имени
        List<String> phoneNumbers = directory.findPhoneNumberByName("Иван Иванов");
        System.out.println("\nНомера телефонов сотрудника Иван Иванов:");
        for (String phoneNumber : phoneNumbers) {
            System.out.println(phoneNumber);
        }

        // Ищем сотрудника по табельному номеру
        Employee employeeById = directory.findEmployeeById(2);
        System.out.println("\nСотрудник с табельным номером 2:");
        if (employeeById != null) {
            System.out.println(employeeById);
        } else {
            System.out.println("\nСотрудник не найден.");
        }

        // Печатаем всех сотрудников
        System.out.println("\nВсе сотрудники:");
        directory.printAllEmployees();
    }
}
