package ru.gb.jcore;

public class Employee extends Person{

    public Employee(String surname, String name, String jobTtle, int salary, int age, String phone){
        super(surname, name, jobTtle, salary, age, phone);
    }

    @Override
    public void raiseSalaris(int salary, int age, Person worker) {

    }
}
