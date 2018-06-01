package com.rabin.fr.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rabin.fr.Entity.Task;
import com.rabin.fr.service.TaskService;

@RestController
@RequestMapping("/api/task")
public class TaskController {

	private TaskService taskService;

	public TaskController(TaskService taskService) {
		super();
		this.taskService = taskService;
	}

	@GetMapping(value = { "", "/" })
	public Iterable<Task> listTask() {

		return this.taskService.list();

	}

	@RequestMapping("/save")
	public Task savaTask(@RequestBody Task task) {
		return this.taskService.save(task);

	}

}
