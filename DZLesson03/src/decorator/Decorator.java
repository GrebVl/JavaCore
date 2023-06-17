package decorator;

import ru.gb.jcore.Person;
import java.util.List;

public class Decorator {
    public static void decorate(List<Person> array){

        /**
         * Метод декорирует массива, добавляя к нему строку
         * при помощи функции форматирования строк
         */
        for(Object k : array){
            System.out.println(k.toString());
        }
    }
}
