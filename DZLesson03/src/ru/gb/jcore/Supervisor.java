package ru.gb.jcore;

public class Supervisor extends Person{
    public Supervisor(String surname, String name, int salary, int age, String phone){
        super(surname, name, "Руководитель", salary, age, phone);
    }

    public void raiseSalaris(int salary, int age, Person worker) {
        if(worker instanceof Employee && worker.getAge() > age){
            worker.setSalary(salary);
        }
    }
}
