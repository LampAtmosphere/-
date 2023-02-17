import java.util.Scanner; 
public class sortmassiva { 
    public static void main(String args[]) 
    { 
        int size, i, j, temp;
        try (Scanner sc = new Scanner(System.in)) {
          
            System.out.print(" Введите размер массива: ");
            size = sc.nextInt();
            
            int array[] = new int[size];
     
       
            System.out.println(" Введите " + size + " элементов массива:");
            for (i = 0; i < size; i++) 
                array[i] = sc.nextInt();
            

            for (i = 0; i < size; i++)
            {
                for (j = i + 1; j < size; j++) 
                {
                    if (array[i] > array[j]) 
                    {
                        temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }
            }
            System.out.print(" Отсортированный массив: \n");
            for (i = 0; i < size - 1; i++) 
                System.out.print(array[i] + ", ");
            System.out.print(array[size - 1]);
        }
    }
}