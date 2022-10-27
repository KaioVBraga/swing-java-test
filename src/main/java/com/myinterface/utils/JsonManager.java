package com.myinterface.utils;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

public class JsonManager<T> {
    String filePath;

    public JsonManager(String filePath) {
        this.filePath = filePath;
    }

    public boolean create(List<T> object) {
        try {
            Gson gson = new GsonBuilder().create();
            Writer writer = new FileWriter(filePath);

            gson.toJson(object, writer);

            writer.flush();
            writer.close();

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean insert(T object) {
        try {
            List<T> list = this.findAll();

            list.add(object);

            this.create(list);

            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public List<T> findAll() {
        try {

            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            Reader reader = new FileReader(filePath);

            Type listType = new TypeToken<ArrayList<T>>() {
            }.getType();
            return gson.fromJson(reader, listType);
        } catch (IOException e) {
            e.printStackTrace();

            return new ArrayList<T>();
        }
    }

}
