package main.java.edu.nyu.cs9053.homework8;

import java.util.ArrayList;
import java.util.List;

public class Test{

    public static void main(String[] args) {
        Task jb1 = new Task(1, 2, 5);
        Task jb2 = new Task(2, 2, 6);
        Task jb3 = new Task(3, 5, 9);
        Task jb4 = new Task(4, 10, 11);
        Task jb5 = new Task(5, 6, 7);
        List<Task> tasks = new ArrayList<>();
        tasks.add(jb1);
        tasks.add(jb2);
        tasks.add(jb3);
        tasks.add(jb4);
        tasks.add(jb5);
        LambdaScheduler ls = new LambdaScheduler();
        List<Task> result = ls.selectTasks(tasks);
        System.out.println(1);
    }
}
