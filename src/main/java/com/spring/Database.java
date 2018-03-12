package com.spring;//Q1) Create a class com.spring.Database with 2 instance variables port and name. Configure com.spring.Database class bean in spring
// container through Spring XML. Initialize instance variables using setter method.


public class Database {
    private String name;
    private Integer port;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    @Override
    public String toString() {
        return "com.spring.Database{" +
                "name='" + name + '\'' +
                ", port=" + port +
                '}';
    }
}
