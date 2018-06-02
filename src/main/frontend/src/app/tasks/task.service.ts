import {Injectable} from '@angular/core';
import {Http} from '@angular/http';
import {map} from 'rxjs/operators';


@Injectable()
export class TaskService {
  constructor(private http: Http) {

  }

  getTask() {
    return this.http.get('/api/task').pipe(map(response => response.json()));
  }
}
