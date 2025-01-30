package com.carlotaml21;

import java.util.ArrayList;
import java.util.List;

public class MultiplicationTable {
    public static List<Integer> generateTable(int n) {
        List<Integer> table = new ArrayList<>();

        for (int i = 1; i <=10; i++){
            table.add(n * i);

        }
        return table;
    }
    
}
