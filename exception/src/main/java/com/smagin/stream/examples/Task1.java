package com.smagin.stream.examples;

import java.io.File;
import java.util.ArrayList;

public class Task1 {
    public ArrayList<Double> readValues(String fileName) {


        try {
            File file = new File(fileName);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }
        return null;
    }
}
