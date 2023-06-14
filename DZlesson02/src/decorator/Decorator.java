package Decorator;
/**
 * Декоратор. Он декорирует, то есть, накладывает на результат декорации.
 * Внешний вид важен, поэтому этот класс существует.
 */
public class Decorator {
    /**
     *Функция декорирования массива для вывода в консоль
     * в виде строки с приамбулой "Заданный массив"
     *
     * @param array массив, требующие декорации
     * @return Отформатированая строка
     */
    public static String decorate(int[] array){

        /**
         * Метод декорирует массива, добавляя к нему строку
         * при помощи функции форматирования строк
         */
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < array.length; i++){
            if(i != array.length-1){
                str.append(array[i]+",");
            }else{
                str.append(array[i]+";");
            }
        }
        return String.format("Заданный массив: %s", str);
    }

    /**
     * Функция декорирования максимального, минимального и среднего значения для вывода в консоль
     * в виде строки с приамбулой "Заданный массив"
     * @param maxNumber максимальное значение массива
     * @param minNumber минимальное значение массива
     * @param avgNumber среднее значение массива
     * @return
     */
    public static String decorateValue(int maxNumber, int minNumber, int avgNumber){

        /**
         * Метод декорирует заданных чисел, добавляя к нему строку
         * при помощи функции форматирования строк
         */
        return String.format("Max: %d;\nMin: %d;\nAvg: %d.\n", maxNumber, minNumber, avgNumber);
    }

}
