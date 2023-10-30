package com.blogspot.collection;

import java.util.ArrayList;
import java.util.List;

public class CustomArrayList extends ArrayList   {
    @Override
    public boolean add(Object o) {
        if (this.contains(o)) {
            return false;
        } else {
            return super.add( o);
        }
    }

    public static void main(String[] args) {
        List integerList = new CustomArrayList();
        integerList.add(1);
        integerList.add(2);
        integerList.add(1);
        integerList.add(2);

        System.out.println("List containing only unique element :"+integerList);
    }
}
