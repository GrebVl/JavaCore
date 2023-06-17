import decorator.Decorator;
import ru.gb.jcore.Employee;
import ru.gb.jcore.Person;
import ru.gb.jcore.Supervisor;

import java.util.*;
import java.lang.Comparable;

public class Main {
    public static void main(String[] args) {
        List<Person> workList = new ArrayList<>();
        workList.add(new Employee("Петров", "Алексей", "Менеджер", 30000, 29, "+79998887766"));
        workList.add(new Employee("Иванов", "Сергей", "Менеджер", 30000, 35, "+79998887766"));
        workList.add(new Employee("Иванова", "Алиса", "Оператор", 25000, 35, "+79998887766"));
        workList.add(new Supervisor("Сидоров", "Станислав", 40000, 30, "+79998887766"));
        Decorator.decorate(workList);
        for(int i = 0; i < workList.size(); i++){
            if(workList.get(i) instanceof Supervisor){
                for(int j =0; j< workList.size(); j++){
                    workList.get(i).raiseSalaris(workList.get(j).getSalary()+5000, 30, workList.get(j));
                }
            }
        }

        Comparator<Person> comparator = Comparator.comparing(obj -> obj.getAge());
        comparator = comparator.thenComparing(obj -> obj.getSalary());

        Collections.sort(workList, comparator);
        System.out.println("---------------");
        Decorator.decorate(workList);
    }
}