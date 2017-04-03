package main.java.edu.nyu.cs9053.homework8;

public class TaskWithMoney extends  Task{
    private final int money;

    public TaskWithMoney(int ID, long startTime, long endTime, int money) {
        super(ID, startTime, endTime);
        this.money = money;
    }

    public int getMoney() {
        return money;
    }
}
