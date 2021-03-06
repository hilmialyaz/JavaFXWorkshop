package de.stevenschwenke.java.javafx.workshop.chapter_3_advanced_basics.E_9_TableView;

import java.util.ArrayList;
import java.util.List;

/**
 * E_9_2_RowValue for the demo.
 * <p>
 * Created by bezze on 04.09.15.
 */
public class E_9_2_RowValue {
    private String name;
    private List<Integer> values = new ArrayList<>();

    public E_9_2_RowValue(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public List<Integer> getValues() {
        return values;
    }
}
