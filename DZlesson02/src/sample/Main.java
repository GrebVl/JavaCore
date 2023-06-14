package sample;

import WorkingArray.WorkingAray;
import Decorator.Decorator;


/**
 * Основной класс приложения. Здесь мы можем описать
 * его основные назначения и способы взаимодействия с ним.
 */
public class Main {
    /**
     * Точка входа в программу. С нее всегда все начинаетя.
     * @param args стандартные оргументы командной стрпоки
     */
    public static void main(String[] args) {
        int[] array = arrayFilling(10);
        System.out.println(Decorator.decorate(array));
        WorkingAray arrayW = new WorkingAray(array);
        System.out.println(Decorator.decorateValue(arrayW.getMaxNumber(), arrayW.getMinNumber(), arrayW.getAvgNumber()));
        System.out.println("количество чётных элементов массива " + arrayW.countEvens(array));
        System.out.println("max - min = " + arrayW.differenceMaxMin(array));
        System.out.println(arrayW.elementZero(array));
        arrayW.sortBubl(array);
        System.out.println(Decorator.decorate(array));
        System.out.println(arrayW.elementZero(array));
    }

    /**
     * создание и заполнение массива рандомными числами
     * @param sizeArray размер массива
     * @return возвращает ссылку на заполненый массив
     */
    public static int[] arrayFilling(int sizeArray){
        int[] array = new int[sizeArray];
        for(int i = 0; i < array.length; i++){
            array[i] = (int) (Math.random() * 10);
        }
        return array;
    }
}