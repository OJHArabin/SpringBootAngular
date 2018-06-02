import {Component, OnInit} from '@angular/core';
import {Task} from '../task.model';
import {TaskService} from '../task.service';

@Component({
  selector: 'app-task-list',
  templateUrl: './task-list.component.html',
  styleUrls: ['./task-list.component.css']
})
export class TaskListComponent implements OnInit {

  tasks: Task[] = [];
  constructor(private taskService: TaskService) {}

  ngOnInit() {
    return this.taskService.getTask()
      .subscribe(
      (tasks: any[]) => {
        this.tasks = tasks;
      },
      (error) => console.log(error)
      );

  }

  getDueDateLabel(task: Task) {
    return task.completed ? 'label-success' : 'label-primary';
  }

  onTaskChange(event, task) {
    console.log('Task has changed');
  }

}
