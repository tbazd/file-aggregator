package com.file.aggregator.common.util;

import com.file.aggregator.common.model.FileDoc;

import java.util.ArrayList;
import java.util.List;

/**
 * CSV Util.
 */
public final class CsvUtil {
    private CsvUtil() {
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    //TODO:
    // Implement functionality here
    // Method should parse string (see CsvUtilTest.CSV_STRING)
    // Method should return list of the filled FileDoc objects
    // Implementation result should be validated with a unit test
    public static List<FileDoc> getFileDoc(String csvFileString) {
        return new ArrayList<>();
    }

}
