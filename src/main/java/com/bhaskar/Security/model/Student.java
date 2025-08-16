package com.bhaskar.Security.model;

public class Student {
    private int id;
    private String name;
    private int marks;

    public Student(String hehe, int i, int i1) {
        this.name=hehe;
        this.marks=i;
        this.id=i1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
