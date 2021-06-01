package home_work_5;

import java.util.*;

public class DataContainer<T> {
    private T[] data;

    DataContainer(T[] data) {
        this.data = data;
    }

    /**
     * Задание 4
     *
     * @param item объект, который вставляем в исходный массив
     * @return индекс вставленного объекта; -1 если невозможно вставить (объект равняется null)
     */

    int add(T item) {
        int index = -1;
        boolean foundNull = false;
        if (item != null) {
            for (int i = 0; i < data.length; i++) {
                if (data[i] == null) {
                    data[i] = item;
                    index = i;
                    foundNull = true;
                    break;
                }
            }
            if (!foundNull) {
                data = Arrays.copyOf(data, data.length + 1);
                data[data.length - 1] = item;
                index = data.length - 1;
            }

        }
        return index;
    }

    /**
     * Задание 5
     *
     * @param index индекс искомого элемента
     * @return искомый элемент; null, если заданный индекс некорректен
     */
    T get(int index) {
        T element = null;
        if (index < data.length && index >= 0) {
            element = data[index];
        }
        return element;
    }

    /**
     * Задание 6
     *
     * @return поле data
     */
    T[] getItems() {
        return data;
    }

    /**
     * Задание 7
     *
     * @param index индекс удаляемого элемента
     * @return если удаление прошло успешно - true, если нет - false
     */
    boolean delete(int index) {
        boolean deleted = false;
        if (index >= 0 && index < data.length) {
            deleted = true;
            T[] temp = Arrays.copyOf(data, data.length - 1);
            for (int i = 0; i < index; i++) {
                temp[i] = data[i];
            }
            for (int i = index + 1; i < data.length; i++) {
                temp[i - 1] = data[i];
            }

            data = Arrays.copyOf(temp, temp.length);
        }
        return deleted;
    }

    /**
     * Задание 8
     *
     * @param item объект, который нужно удалить
     * @return true, если удаление прошло успешно; false, если объект отсутствует в массиве
     */
    boolean delete(T item) {
        boolean deleted = false;
        int count = 0;

        while (!deleted && count != data.length) {
            for (int i = 0; i < data.length; i++) {
                if (data[i].equals(item)) {
                    deleted = true;
                    T[] temp = Arrays.copyOf(data, data.length - 1);
                    for (int j = 0; j < i; j++) {
                        temp[j] = data[j];
                    }
                    for (int k = i + 1; k < data.length; k++) {
                        temp[k - 1] = data[k];
                    }
                    data = Arrays.copyOf(temp, temp.length);
                    break;
                }
            }
            count++;
        }
        return deleted;
    }

    /**
     * Задание 9
     *
     * @param comparator объект с реализацией логики сравнения
     */
    void sort(Comparator<T> comparator) {
        for (int i = 0; i < data.length; i++) {
            for (int j = i + 1; j < data.length; j++) {
                T tmp;
                if (comparator.compare(data[i], data[j]) > 0) {
                    tmp = data[i];
                    data[i] = data[j];
                    data[j] = tmp;
                }
            }
        }
    }

    /**
     * Задание 10
     *
     * @return элементы не равные null
     */
    @Override
    public String toString() {
        List<T> forString = new ArrayList<>();
        for (T element : data) {
            if (element != null) {
                forString.add(element);
            }
        }
        return forString.toString();
    }
}
