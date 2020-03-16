package ru.geekbrains.java_one.home_4;

public class Employee {
    String surname;
    int salary;
    int age;
    String position;

    public Employee (String surname, int salary, int age, String position) {
        this.surname = surname;
        this.age = age;
        this.position = position;
        this.salary = salary;
    }

    public String getSurname () {
        return surname;
    }

    public int getSalary () {
        return salary;
    }

    public int getAge () {
        return age;
    }

    public String getPosition (){
        return position;
    }


}
