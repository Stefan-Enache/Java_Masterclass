package com.pluralsight.calcengine;

import java.util.List;

public interface ISaveable {
    List<String> write();

    void read(List<String> savedValues);

}
