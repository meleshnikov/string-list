package org.example.list;

import org.example.exception.MissingStringException;
import org.example.exception.NullArgumentException;

import java.util.ArrayList;

public class StringArrayList extends ArrayList<String> implements StringList {

    @Override
    public String addS(String item) {
        if (item == null) {
            throw new NullArgumentException("null not supported!");
        }
        add(item);
        return item;
    }

    @Override
    public String addS(int index, String item) {
        if (item == null) {
            throw new NullArgumentException("null not supported!");
        }
        add(index, item);
        return item;
    }

    @Override
    public String removeS(String item) {
        if (!remove(item)) {
            throw new MissingStringException(item + " not found!");
        }
        return item;
    }
}
