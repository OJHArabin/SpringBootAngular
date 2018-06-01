package com.rabin.fr.repository;

import org.springframework.data.repository.CrudRepository;

import com.rabin.fr.Entity.Task;

public interface TaskRepository extends CrudRepository<Task, Long> {

}
