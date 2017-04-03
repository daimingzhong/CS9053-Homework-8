package main.java.edu.nyu.cs9053.homework8;

import java.util.*;

public class LambdaWeightedScheduler {
    public List<TaskWithMoney> selectTasks(List<TaskWithMoney> tasks) {
        List<TaskWithMoney> result = new ArrayList<>();
        if (tasks == null || tasks.size() <= 1) {
            return tasks;
        }
        Comparator<TaskWithMoney> comparator = new Comparator<TaskWithMoney>() {
            @Override
            public int compare(TaskWithMoney o1, TaskWithMoney o2) {
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
        Map<Integer, List<Integer>> hashMap = new HashMap<>();
        int dp[] = new int[tasks.size()];
        dp[0] = tasks.get(0).getMoney();
        List<Integer> ini =  new ArrayList<>();
        ini.add(0);
        hashMap.put(0, ini);
        for (int i = 1; i < tasks.size(); i++) {
            int j = helper(i, tasks);
            if (dp[i - 1] >= dp[j] + tasks.get(i).getMoney()) {
                dp[i] = dp[i - 1];
                List<Integer> tmp = new ArrayList<>(hashMap.get(i - 1));
                tmp.add(i);
                hashMap.put(i, tmp);
            }
            else {
                dp[i] = dp[j];
                hashMap.put(i, new ArrayList<>(hashMap.get(j)));
            }
        }
        List<Integer> tmp = hashMap.get(tasks.size());
        for (int i = 0; i < tmp.size(); i++){
            result.add(tasks.get(tmp.get(i)));
        }
        return result;
    }

    // find the closest task finish before i-th task begin
    private int helper(int i, List<TaskWithMoney> tasks) {
        int left = 0;
        int right = i;
        while(left < right - 1) {
            int mid = (right - left)/2 + left;
            if (tasks.get(mid).getEndTime() <= tasks.get(i).getStartTime()) {
                left = mid;
            }
            else {
                right = mid;
            }
        }
        if (tasks.get(right).getEndTime() <= tasks.get(i).getStartTime()) {
            return right;
        }
        else if (tasks.get(right).getEndTime() <= tasks.get(i).getStartTime()) {
            return left;
        }
        else {
            return 0;
        }
    }
}