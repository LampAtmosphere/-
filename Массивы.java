import java.util.Arrays;
public class Массивы {
    public static void main(String[] args) {
        int[] array = new int[25];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 10);
        }
        // Нахождение минимального элемента 
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        // Нахождение среднего арифметического 
        double avg = 0;
        for (int i = 0; i < array.length; i++) {
            avg += array[i];
        }
        avg /= array.length;
        // Суммирование 
        double sum = min + avg;
        System.out.println("Сумма минимального элемента " + min + " и среднего арифметического " + avg + " равна " + sum);
    }
}
