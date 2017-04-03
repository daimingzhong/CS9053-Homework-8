package main.java.edu.nyu.cs9053.homework8;

public class Task {
    private final int ID;
    private final long startTime;
    private final long endTime;

    public Task(int ID, long startTime, long endTime) {
        this.ID = ID;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public int compareTo(Task t) {
        if (this.endTime - t.endTime == 0) {
            return 0;
        }
        else if (this.endTime - t.endTime > 0) {
            return 1;
        }
        else {
            return -1;
        }
    }

    public int getID(){
        return ID;
    }

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }
}
