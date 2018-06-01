package com.rabin.fr.Entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class Task {
	@Id
	private Long id;
	private String name;
	@JsonFormat(pattern = "MM/dd/yyyy")
	private LocalDate dueDate;
	private Boolean completed;

	public Task() {
		super();
	}

}
