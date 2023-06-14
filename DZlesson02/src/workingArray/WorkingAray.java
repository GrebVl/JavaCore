package WorkingArray;

/**
 * Произведение работ с масивом целых чисил
 */
public class WorkingAray {

    private int maxNumber; //Max значение массива
    private int minNumber; // Min значение массива
    private int avgNumber = 0; // Среднее значение массива

    /**
     * Конструктор для инициализации
     *
     * @param array заданный массив целых чисел
     */
    public WorkingAray(int[] array) {
        findingValue(array);
    }

    /**
     * Инициализация Max, Min, Avg
     *
     * @param array заданный массив целых чисел
     */
    public void findingValue(int[] array) {
        this.maxNumber = array[0];
        this.minNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            if (this.maxNumber < array[i]) {
                this.maxNumber = array[i];
            } else if (this.minNumber > array[i]) {
                this.minNumber = array[i];
            }
            this.avgNumber += array[i] / array.length;
        }
    }

    /**
     * Сортировка массива пузырьком
     *
     * @param array
     */
    public void sortBubl(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i; j < array.length; j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
            }
            if (min != i) {
                int var = array[min];
                array[min] = array[i];
                array[i] = var;
            }
        }
    }

    /**
     * Получение среднего значения
     *
     * @return возвращает среднее значение
     */
    public int getAvgNumber() {
        return avgNumber;
    }

    /**
     * устанавливает среднего значения
     *
     * @param avgNumber заданое среднее значение
     */
    public void setAvgNumber(int avgNumber) {
        this.avgNumber = avgNumber;
    }

    /**
     * Получение максимального значения
     *
     * @return
     */
    public int getMaxNumber() {
        return maxNumber;
    }

    /**
     * установление максимального значения
     *
     * @param maxNumber заданое максимальное значение
     */
    public void setMaxNumber(int maxNumber) {
        this.maxNumber = maxNumber;
    }

    /**
     * Получение минимального значения
     *
     * @return
     */
    public int getMinNumber() {
        return minNumber;
    }

    /**
     * установление минимального значения
     *
     * @param minNumber заданое минимальное значение
     */
    public void setMinNumber(int minNumber) {
        this.minNumber = minNumber;
    }

    /**
     * метод, возвращающий количество чётных элементов массива
     *
     * @param array
     * @return
     */
    public int countEvens(int[] array) {
        int count = 0;
        if (array.length > 0) {
            for (int i = 0; i < array.length; i++) {
                if (array[i] % 2 == 0) {
                    count++;
                }
            }
            return count;
        } else {
            return -1;
        }
    }

    /**
     * функцию, возвращающую разницу между самым большим и самым ма- леньким элементами
     *
     * @param array
     * @return
     */
    public int differenceMaxMin(int[] array) {
        if (array.length > 0) {
            findingValue(array);
            return maxNumber - minNumber;
        } else {
            return -1;
        }
    }

    /**
     * функцию, возвращающую истину,
     * если в переданном массиве есть два соседних элемента, с нулевым значением
     * @param array
     * @return
     */
    public boolean elementZero(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == 0 && array[i + 1] == 0) {
                return true;
            }
        }
        return false;
    }
}
