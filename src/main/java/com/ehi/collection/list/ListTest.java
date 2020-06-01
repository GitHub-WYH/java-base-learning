package com.ehi.collection.list;

/**
 * ClassName: ListTest
 *
 * @Author: WangYiHai
 * @Date: 2020/4/13 14:26
 * @Description: TODO
 */
public class ListTest {
    public static void main(String[] args){
        MyList<Integer> myList = new MyList<Integer>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        System.out.println(myList.get(2));

    }
}