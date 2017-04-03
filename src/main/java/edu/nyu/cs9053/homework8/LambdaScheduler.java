package main.java.edu.nyu.cs9053.homework8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class LambdaScheduler {

    public List<Task> selectTasks(List<Task> tasks) {
        List<Task> result = new ArrayList<>();
        if (tasks == null || tasks.size() == 0) {
            return result;
        }
        Comparator<Task> comparator = new Comparator<Task>() {
            @Override
            public int compare(Task o1, Task o2) {
                if (o1.getEndTime() == o2.getEndTime()) {
                    return 0;
                } else if (o1.getEndTime() < o2.getEndTime()) {
                    return -1;
                } else {
                    return 1;
                }
            }
        };
        Collections.sort(tasks, comparator);
        result.add(tasks.get(0));
        if(tasks.size() == 1) {
            return result;
        }
        long endTime = tasks.get(0).getEndTime();
        for (int i = 1; i < tasks.size(); i++) {
            if (tasks.get(i).getStartTime() >= endTime) {
                result.add(tasks.get(i));
                endTime = tasks.get(i).getEndTime();
            }
        }
        return result;
    }

}
