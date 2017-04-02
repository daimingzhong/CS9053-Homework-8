package main.java.edu.nyu.cs9053.homework8;

/**
 * Created by dai on 4/2/17.
 */

public class JobInformation {
    private int ID;
    private int startTime;
    private int endTime;

    public JobInformation(int ID, int startTime, int endTime) {
        this.ID = ID;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public int getID(){
        return ID;
    }

    public int getStartTime() {
        return startTime;
    }

    public int getEndTime() {
        return endTime;
    }
}
