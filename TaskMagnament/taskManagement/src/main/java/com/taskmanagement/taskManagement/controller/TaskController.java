package com.taskmanagement.taskManagement.controller;

import com.taskmanagement.taskManagement.model.Task;
import com.taskmanagement.taskManagement.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/task")
public class TaskController {

    @Autowired
    private TaskService taskService;

    @GetMapping
    public List<Task> listarTareas() {
        return taskService.listarTareas();
    }

    @PostMapping
    public Task crearTarea(@RequestBody Task task) {
        return taskService.guardarTarea(task);
    }

    @DeleteMapping("/{id}")
    public void eliminarTarea(@PathVariable Long id) {
        taskService.eliminarTarea(id);
    }
}
