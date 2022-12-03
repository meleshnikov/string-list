package org.example.list;

import org.example.exception.MissingElementException;
import org.example.exception.NullArgumentException;

import java.util.ArrayList;

public class CustomArrayList<E> extends ArrayList<E> implements CustomList<E> {

    @Override
    public E addE(E item) {
        if (item == null) {
            throw new NullArgumentException("null not supported!");
        }
        add(item);
        return item;
    }

    @Override
    public E addE(int index, E item) {
        if (item == null) {
            throw new NullArgumentException("null not supported!");
        }
        add(index, item);
        return item;
    }

    @Override
    public E removeE(E item) {
        if (!remove(item)) {
            throw new MissingElementException(item + " not found!");
        }
        return item;
    }

}
