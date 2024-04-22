package ru.gb.Java_Spring_4.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.gb.Java_Spring_4.domain.Task;
import ru.gb.Java_Spring_4.repository.TaskRepository;

import java.util.List;
@AllArgsConstructor
@Service
public class TaskService {
    private final TaskRepository taskRepository;
    public List<Task> getTasks(){
        return taskRepository.getTasks();
    }

    public List<Task> addTask(Task task){
        return taskRepository.addTask(task);
    }
}
