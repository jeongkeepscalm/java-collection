package collection.test;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;

public class TaskScheduler {

    private Deque<Task> tasks = new ArrayDeque<>();

    public void addTask(Task task) {
        tasks.offerLast(task);
    }

    public int getRemainingTasks() {
        return tasks.size();
    }


    public void processNextTask() {
        Objects.requireNonNull(tasks.pollFirst()).execute();
        /*
            Task task = tasks.poll();
            if (task != null) {
                task.execute();
            }
         */
    }
}
