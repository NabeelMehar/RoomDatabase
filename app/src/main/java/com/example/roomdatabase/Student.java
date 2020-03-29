package com.example.roomdatabase;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "student")
public class Student {

    @PrimaryKey(autoGenerate = true)
    private
    int id;

    @ColumnInfo(name = "name")
    private
    String name;

    @ColumnInfo(name = "standard")
    private
    String standard;

    @ColumnInfo(name = "section")
    private
    String section;


    public Student(String name, String standard, String section) {
        this.name = name;
        this.standard = standard;
        this.section = section;
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

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", standard='" + standard + '\'' +
                ", section='" + section + '\'' +
                '}';
    }
}
