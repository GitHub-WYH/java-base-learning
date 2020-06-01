package com.ehi.collection.list;

/**
 * ClassName: MyList
 *
 * @Author: WangYiHai
 * @Date: 2020/4/13 16:51
 * @Description: TODO
 */
public class MyList<T> {

    public static final int default_capacity = 10;
    Object[] data;
    int size = 0;

    public MyList() {
        data = new Object[default_capacity];
    }

    public MyList(int capacity) {
        if (capacity > 0) {
            data = new Object[capacity];
        }else if (capacity == 0){
            data = new Object[0];
        }else {
            throw new IllegalArgumentException("Illegal capacity:" + capacity);
        }
    }

    public void add(T t) {
        if (size < data.length){
            for (int i = 0; i < data.length; i++) {
                if (data[i] == null) {
                    data[i] = t;
                    this.size++;
                }
                continue;
            }
        }
    }

    public T get(int index) {
        if (index >=0 && index <= data.length) {
            return (T) data[index];
        }
        return null;
    }

    public boolean remove(int index) {
        if (index >=0 && index <= data.length) {
            data[index] = null;
            return true;
        }
        return false;
    }

}