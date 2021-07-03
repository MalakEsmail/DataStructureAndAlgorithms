package DynamicArray;

import java.util.Arrays;

public class DynamicArray<T> {

    int size;
    Object[] data;
     int newCapacity;

    public DynamicArray() {
        size = 0;
        data = new Object[1];
    }

    public void put(Object element) {
        ensureCapacity(size+1);
        data[size++]=element;

    }

    public T get(int index) {
        return (T) data[index];
    }

    public int getSize() {
        return data.length;
    }

    public void ensureCapacity(int minCapacity) {
        int oldCapacity = getSize();
        if (minCapacity > oldCapacity) 
             newCapacity = oldCapacity * 2;
             if ( newCapacity <minCapacity ) 
            newCapacity = minCapacity ;
            data=Arrays.copyOf(data,newCapacity);

    }
}
