package danescu.miruna.project.model;

public class Record {
    private String name;
    private int duration;

    public Record(String name, int duration) {
        this.name = name;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return name + " " + duration;
    }
}
