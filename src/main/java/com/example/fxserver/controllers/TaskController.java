package com.example.fxserver.controllers;

import com.example.fxserver.entity.Task;
import com.example.fxserver.repositories.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TaskController {

    @Autowired
    private TaskRepository taskRepository;

    @GetMapping("/tasks")
    Iterable<Task> allTasks () {
        // с помощью репозитория из базы получим все задачи
        return taskRepository.findAll();
    }

    @GetMapping("/tasks/{id}")
    Task taskById(@PathVariable Integer id) { // данные придут строкой
        return taskRepository.findById(id).get();
    }

    @PostMapping("/tasks")
    Task addTask(@RequestBody Task task) { // данные придут в теле сообщения
        return taskRepository.save(task);
    }

    @DeleteMapping("/tasks/{id}")
    void deleteTaskById (@PathVariable Integer id) {
        taskRepository.deleteById(id);
    }


}
