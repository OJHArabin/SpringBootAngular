package com.rabin.fr.service;

import com.rabin.fr.Entity.Task;

public interface TaskService {

	Iterable<Task> list();
	Task save(Task task);
}
