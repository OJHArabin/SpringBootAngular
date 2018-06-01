package com.rabin.fr.service;

import org.springframework.stereotype.Service;

import com.rabin.fr.Entity.Task;
import com.rabin.fr.repository.TaskRepository;

@Service
public class TaskServiceImpl implements TaskService {

	private TaskRepository taskRepository;

	public TaskServiceImpl(TaskRepository taskRepository) {
		super();
		this.taskRepository = taskRepository;
	}

	@Override
	public Iterable<Task> list() {

		return this.taskRepository.findAll();
	}

	@Override
	public Task save(Task task) {

		return this.taskRepository.save(task );
	}

}
