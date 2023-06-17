package ru.gb.jcore;

public abstract class Person {
    private String surname;
    private String name;
    private String jobTitle;
    private int salary;
    private int age;
    private String phone;

    public Person(String surname, String name, String jobTtle, int salary, int age, String phone){
        this.surname = surname;
        this.name = name;
        this.jobTitle = jobTtle;
        this.salary = salary;
        this.age = age;
        this.phone = phone;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public int getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public String getPhone() {
        return phone;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return String.format("%s: %s %s %d\nЗП: %d", this.jobTitle, this.surname, this.name, this.age, this.salary);
    }

    public abstract void raiseSalaris(int salary, int age, Person worker);
}
