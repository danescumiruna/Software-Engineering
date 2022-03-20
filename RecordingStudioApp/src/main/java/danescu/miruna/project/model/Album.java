package danescu.miruna.project.model;

import danescu.miruna.project.model.Record;

import java.util.Vector;

public class Album {
    private String name;
    private Vector<Record> records = new Vector<>();

    public Album(String name) {
        this.name = name;
    }

    public void addRecord(Record record) {
        records.add(record);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
