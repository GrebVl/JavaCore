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
     * @param array заданный массив целых чисел
     */
   public WorkingAray(int[] array){
        findingValue(array);
    }

    /**
     * Инициализация Max, Min, Avg
     * @param array заданный массив целых чисел
     */
    public void findingValue(int[] array){
        this.maxNumber = array[0];
        this.minNumber = array[0];
        for(int i = 0; i < array.length; i++){
            if(this.maxNumber < array[i]){
                this.maxNumber = array[i];
            }else if(this.minNumber > array[i]){
                this.minNumber = array[i];
            }
            this.avgNumber += array[i]/array.length;
        }
    }

    /**
     * Сортировка массива пузырьком
     * @param array
     */
    public void sortBubl(int[] array){
        for(int i = 0; i< array.length; i++){
            int min = i;
            for(int j = i; j < array.length; j++){
                if(array[min]>array[j]){
                    min = j;
                }
            }
            if(min != i){
                int var = array[min];
                array[min] = array[i];
                array[i] = var;
            }
        }
    }

    /**
     * Получение среднего значения
     * @return возвращает среднее значение
     */
    public int getAvgNumber() {
        return avgNumber;
    }

    /**
     * устанавливает среднего значения
     * @param avgNumber заданое среднее значение
     */
    public void setAvgNumber(int avgNumber) {
        this.avgNumber = avgNumber;
    }

    /**
     * Получение максимального значения
     * @return
     */
    public int getMaxNumber() {
        return maxNumber;
    }

    /**
     * установление максимального значения
     * @param maxNumber заданое максимальное значение
     */
    public void setMaxNumber(int maxNumber) {
        this.maxNumber = maxNumber;
    }

    /**
     * Получение минимального значения
     * @return
     */
    public int getMinNumber() {
        return minNumber;
    }

    /**
     * установление минимального значения
     * @param minNumber заданое минимальное значение
     */
    public void setMinNumber(int minNumber) {
        this.minNumber = minNumber;
    }
}
