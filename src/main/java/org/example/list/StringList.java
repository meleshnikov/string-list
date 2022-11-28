package org.example.list;

import java.util.List;

public interface StringList extends List<String> {

    String addS(String item);

    String addS(int index, String item);

    String removeS(String item);

}
