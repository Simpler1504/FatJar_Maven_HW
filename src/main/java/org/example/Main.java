package org.example;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {
        MyName myName = new MyName("Artem", "Laptev");
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(myName);

        System.out.println(json);
    }
}

class MyName {
    private String name;
    private String lastName;

    public MyName(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}