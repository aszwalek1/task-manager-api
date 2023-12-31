package com.example.taskmanager.service;

import com.example.taskmanager.model.Task;
import com.example.taskmanager.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public List<Task> allTasks() {
        return taskRepository.findAll();
    }

    public Optional<Task> singleTask(String taskId) {
        return taskRepository.findTaskByTaskId(taskId);
    }

}
