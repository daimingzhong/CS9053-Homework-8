package main.java.edu.nyu.cs9053.homework8;

import java.util.ArrayList;
import java.util.List;

public class Test{

    public static void main(String[] args) {
//        Task jb1 = new Task(1, 2, 5);
//        Task jb2 = new Task(2, 2, 6);
//        Task jb3 = new Task(3, 5, 9);
//        Task jb4 = new Task(4, 10, 11);
//        Task jb5 = new Task(5, 6, 17);
//        List<Task> tasks = new ArrayList<>();
//        tasks.add(jb1);
//        tasks.add(jb2);
//        tasks.add(jb3);
//        tasks.add(jb4);
//        tasks.add(jb5);
//        LambdaScheduler ls = new LambdaScheduler();
//        List<Task> result = ls.selectTasks(tasks);
//        System.out.println(1);

        TaskWithMoney jb1 = new TaskWithMoney(0, 2, 3, 10);
        TaskWithMoney jb2 = new TaskWithMoney(1, 3, 6, 11);
        TaskWithMoney jb3 = new TaskWithMoney(2, 4, 6, 12);
        TaskWithMoney jb4 = new TaskWithMoney(3, 5, 6, 13);
        TaskWithMoney jb5 = new TaskWithMoney(4, 6, 7, 14);

        List<TaskWithMoney> tasks = new ArrayList<>();
        tasks.add(jb1);
        tasks.add(jb2);
        tasks.add(jb3);
        tasks.add(jb4);
        tasks.add(jb5);
        LambdaWeightedScheduler ls = new LambdaWeightedScheduler();
        List<TaskWithMoney> result = ls.selectTasks(tasks);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i).getID());

        }
    }
}
