package Generic_Array_Creator;

import java.lang.reflect.Array;

class ArrayCreator {
    public static <T> T[] create(int length, T item) {
        Object[] array = (Object[]) Array.newInstance(item.getClass(), length);
        for (int i = 0; i < length; i++) {
            array[i] = item;
        }
        return (T[]) array;
    }

    public static <T> T[] create(Class<T> cl, int length, T item) {
        Object[] array = (Object[]) Array.newInstance(cl, length);
        for (int i = 0; i < length; i++) {
            array[i] = item;
        }
        return (T[]) array;
    }
}
