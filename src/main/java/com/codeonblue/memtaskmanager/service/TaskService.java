package com.codeonblue.memtaskmanager.service;

import com.codeonblue.memtaskmanager.model.Task;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;

@Service
@RequiredArgsConstructor
public class TaskService {

    private final Map<Long, Task> tasks = new ConcurrentHashMap<>();
    private final AtomicLong counter = new AtomicLong(1);

    public List<Task> getAllTasks() {
        return new ArrayList<>(tasks.values());
    }

    public Task getTaskById(Long id) {
        return tasks.get(id);
    }

    public Task createTask(Task task) {
        long id = counter.getAndIncrement();
        task.setId(id);
        tasks.put(id, task);
        return task;
    }

    public Task updateTask(Long id, Task task) {
        if (tasks.containsKey(id)) {
            task.setId(id);
            tasks.put(id, task);
            return task;
        }
        return null;
    }

    public boolean deleteTask(Long id) {
        return tasks.remove(id) != null;
    }
}
