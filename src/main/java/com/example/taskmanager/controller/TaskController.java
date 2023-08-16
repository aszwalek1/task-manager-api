package com.example.taskmanager.controller;

import com.example.taskmanager.model.Task;
import com.example.taskmanager.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/tasks")

public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping
    public ResponseEntity<List<Task>> getTasks() {
        return new ResponseEntity<List<Task>>(taskService.allTasks(), HttpStatus.OK);
    }

    @GetMapping("/{taskId}")
    public ResponseEntity<Optional<Task>> getSingleTask(@PathVariable String taskId) {
        return new ResponseEntity<Optional<Task>>(taskService.singleTask(taskId), HttpStatus.OK);
    }
}
