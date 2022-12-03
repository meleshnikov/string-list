package org.example.list;

import java.util.List;

public interface CustomList<E> extends List<E> {

    E addE(E item);

    E addE(int index, E item);

    E removeE(E item);

}
