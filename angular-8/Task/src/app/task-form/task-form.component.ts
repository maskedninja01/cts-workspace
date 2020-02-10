import { Component, OnInit } from '@angular/core';
import { Task } from '../models/task';
import { TaskService } from '../services/task.service';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-task-form',
  templateUrl: './task-form.component.html',
  styleUrls: ['./task-form.component.css']
})
export class TaskFormComponent implements OnInit {
  private task: Task;
  private isNew: boolean;
  private sdStr: string;
  private edStr: string;

  constructor(
    private taskServ:TaskService,
    private routeData: ActivatedRoute,
    private router: Router
  ) { }

  ngOnInit() {
    this.routeData.params.subscribe(
      (params)=>{
        let taskId= params['tid'];

        if(taskId==undefined){
          this.isNew=true;
          this.task= new Task();
          this.sdStr=(new Date()).toISOString().substr(0,10);
          this.edStr=(new Date()).toISOString().substr(0,10);
        }
      }
    );
  }

  sdUpdate(){
    this.task.startDate=new Date(this.sdStr);
  }

  edUpdate(){
    this.task.endDate= new Date(this.edStr);
  }

  save(){
    if(this.isNew){
      this.taskServ.add(this.task);
    }else{
      this.taskServ.update(this.task);
    }
    this.router.navigateByUrl("/list");
  }
}
