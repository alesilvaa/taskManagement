package com.taskmanagement.taskManagement.service;

import com.taskmanagement.taskManagement.model.Task;
import com.taskmanagement.taskManagement.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {

    @Autowired
    private TaskRepository taskRepository;

    public List<Task> listarTareas() {
        return taskRepository.findAll();
    }

    public Task guardarTarea(Task task) {
        return taskRepository.save(task);
    }

    public void eliminarTarea(Long id) {
        taskRepository.deleteById(id);
    }
}
