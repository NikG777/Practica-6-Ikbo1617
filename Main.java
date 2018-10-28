import java.util.Random;

public class Main {
    public static void main(String[] args)
    {
        Student[] students = new Student[25];
        Random random = new Random();
        for (int i = 0; i < students.length ; i++)
        {
            students[i] = new Student();
            students[i].setId(random.nextInt(100));
        }
        QuickSort(students,0,24);
        for (int i = 0; i< students.length ; i++) {
            System.out.println(students[i]);
        }
    }
    public static void QuickSort(Student[] array, int low, int high) {
        if (array.length == 0)
            return;//завершить выполнение если длина массива равна 0

        if (low >= high)
            return;//завершить выполнение если уже нечего делить

        // выбрать опорный элемент
        int middle = low + (high - low) / 2;
        int opora = array[middle].getId();

        // разделить на подмассивы, который больше и меньше опорного элемента
        int i = low, j = high;
        while (i <= j) {
            while (array[i].getId() < opora) {
                i++;
            }

            while (array[j].getId() > opora) {
                j--;
            }

            if (i <= j) {//меняем местами
                int temp = array[i].getId();
                array[i].setId(array[j].getId());
                array[j].setId(temp);
                i++;
                j--;
            }
        }

        // вызов рекурсии для сортировки левой и правой части
        if (low < j)
            QuickSort(array, low, j);

        if (high > i)
            QuickSort(array, i, high);
    }

}