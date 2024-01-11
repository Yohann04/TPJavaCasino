package org.example;

import com.google.gson.Gson;

public class ColumnsHandler {
    private String[][] columns;

    public ColumnsHandler(String json) {
        Gson gson = new Gson();
        this.columns = gson.fromJson(json, String[][].class);
    }

    public String[][] getColumns() {
        return columns;
    }
}