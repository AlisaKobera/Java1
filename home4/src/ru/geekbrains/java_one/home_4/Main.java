package ru.geekbrains.java_one.home_4;

public class Main {
    public static void main (String [] args) {
        Employee employee = new Employee("Ivanov", 40000, 35, "manager");

        System.out.println(employee.getSurname());
        System.out.println(employee.getPosition());

        Employee [] employees = new Employee[5];
        employees [0] = new Employee("Petrov", 35000, 46, "director");
        employees [1] = new Employee("Sidorov", 27500, 38, "secretary");
        employees [2] = new Employee("Makarov",22630, 56, "cleaner");
        employees [3] = new Employee("Sapko", 27800, 53, "postman");
        employees [4] = new Employee("Kuznetsov", 31870, 29,"manager");

        for (int i = 0; i < employees.length; i ++) {
            if (employees[i].getAge() > 40) {
                System.out.println("Сотрудники старше сорока лет: " + employees[i].getSurname());
            }
        }
        for (int i = 0; i < employees.length; i ++) {
            if (employees[i].getAge() > 45) {
                System.out.println("Зарплата " + employees[i].getSurname() + " составит " + (employees[i].getSalary() + 5000));
            }
        }




    }
}
