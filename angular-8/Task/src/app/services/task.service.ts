import { Injectable } from '@angular/core';
import { Task } from '../models/task';

@Injectable({
  providedIn: 'root'
})
export class TaskService {
  tasks:Task[];

  constructor() {
    this.tasks=[
      {taskId:101,taskName:"Ordering Food",startDate:new Date("2020-02-11"),endDate:new Date("2020-02-12")},
      {taskId:102,taskName:"Doing Laundry",startDate:new Date("2020-01-11"),endDate:new Date("2020-01-12")},
      {taskId:103,taskName:"Doing Payment",startDate:new Date("2020-02-05"),endDate:new Date("2020-02-07")},
      {taskId:104,taskName:"Cooking",startDate:new Date("2020-01-15"),endDate:new Date("2020-01-17")}
    ]
   }

   getAll():Task[]{
     return this.tasks;
   }

   get(id:number){
     return this.tasks.find((t)=>(t.taskId==id));
   }

   add(task:Task){
     this.tasks.push(task);
   }

   update(task:Task){
     let index = this.tasks.findIndex((t)=>(t.taskId===task.taskId));
     if(index>-1){
       this.tasks[index]=task;
     }
   }

   delete(id:number){
     let index= this.tasks.findIndex((task)=>(task.taskId===id));
     if(index>-1){
       this.tasks.splice(index,1);
     }
   }
}
