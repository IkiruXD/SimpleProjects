package arraylist_implementation;

import java.util.Arrays;

public class ArrayListImpl {
    private int[] array;
    private int size;

    private void setCapacity(int size) {
        this.capacity = (int) Math.pow(2, Math.ceil(Math.log(size) / Math.log(2)));
    }

    private int capacity;

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getSize() {
        return size;
    }

    public int getCapacity() {
        return capacity;
    }

    public ArrayListImpl(int size) {
        this.array = new int[size];
        this.size = size;
        setCapacity(size);
    }

    public ArrayListImpl() {
        //todo использование единого конструктора
        clear();
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < size; i++) {
            result += this.array[i] + ", ";
        }

        return "array=" + result;
    }

    public boolean add(int element) {
        add(size, element);
        return true;
    }

    public boolean add(int index, int element) {
        if (index >= 0) {
            try {
                // todo реализовать увеличение массива кратное степени 2
                this.array = Arrays.copyOf(this.array, index < this.array.length ? this.array.length + 1 : index + 1);
                if (index < this.array.length) {
                    for (int i = array.length - 1; i > index; i--) {
                        this.array[i] = this.array[i - 1];
                    }
                }
                this.array[index] = element;
                this.size++;
            } catch (Exception e) {
                return false;
            }

            return true;
        } else {
            return false;
        }
    }

    public int delete(int index) {
        if (index >= 0 && index < size) {
            int temp = this.array[index];
            for (int i = index; i < array.length - 1; i++) {
                this.array[i] = this.array[i + 1];
            }
            this.size--;
            return temp;
        }

        return 0;
    }

    public void clear() {
        this.size = 0;
        this.capacity = 0;
        this.array = new int[0];
    }

    // задание 6. проверить содержится ли элемент в коллекции
    public boolean checkElement(int element) {
        for (int value : array) {
            if (element == value) {
                return true;
            }
        }
        return false;
    }

    //задание 7.вернуть копию массива


    //задание 8. получить элемент по индексу
    public int getElement(int index) {
        /*есть ли необходимость в условии?
        if (index < 0 && index > size) {
            return 0;
        }
        */
        return array[index];
    }

    //задание 9.получить индекс первого вхождения
    public int firstIndex(int element) {
        for (int i = 0; i < array.length; i++) {
            if (element == this.array[i]) {
                return i;
            }
        }
        return -1;
    }

    //задание 10.получить индекс последнего вхождения
    public int lastIndex(int element) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (element == this.array[i]) {
                return i;
            }
        }
        return -1;
    }

    //задание 11.переопределить метод equals

}
